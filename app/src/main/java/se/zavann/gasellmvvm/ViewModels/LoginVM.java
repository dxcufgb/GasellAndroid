package se.zavann.gasellmvvm.ViewModels;

import android.content.Context;
import android.widget.Toast;

import se.zavann.gasellmvvm.AndroidRest;
import se.zavann.gasellmvvm.DTO.DTOLogin;
import se.zavann.gasellmvvm.ErrorConstants;
import se.zavann.gasellmvvm.GasellRest;
import se.zavann.gasellmvvm.Listeners.LoginVMListener;
import se.zavann.gasellmvvm.Models.Login;

/**
 * Created by Bullen on 2015-10-06.
 */
public class LoginVM {

    private LoginVMListener listener;
    private GasellRest rest;
    private Context context;
    private Login loginObj;


    public LoginVM(Context context, final Login loginObj, LoginVMListener listener){

        rest = new GasellRest();

        this.context = context;
        this.loginObj = loginObj;
        this.listener = listener;

        if (this.loginObj.getUsername().equals("") || this.loginObj.getUsername().equals(null)) {
            //send error message
            Toast.makeText(this.context, ErrorConstants.USERNAME_OR_PASSWORD_IS_EMPTY, Toast.LENGTH_LONG).show();
        } else if (this.loginObj.getPassword().equals("") || this.loginObj.getPassword().equals(null)) {
            //send error message
            Toast.makeText(this.context, ErrorConstants.USERNAME_OR_PASSWORD_IS_EMPTY, Toast.LENGTH_LONG).show();
        } else {
            //check login
            int resp = rest.login(loginObj.getUsername(), loginObj.getPassword());

            switch (resp) {
                case -1:
                    Toast.makeText(this.context, ErrorConstants.PASSWORD_IS_NOT_VALID, Toast.LENGTH_LONG).show();
                    break;
                case 0:
                    Toast.makeText(this.context, ErrorConstants.ERROR_CODE_100, Toast.LENGTH_LONG).show();
                    break;
                case 1:
                    this.listener.onLoginSuccess();
                    break;
                case 2:
                    Toast.makeText(this.context, ErrorConstants.USERNAME_IS_NOT_VALID, Toast.LENGTH_LONG).show();
                    break;
                default:
                    Toast.makeText(this.context, ErrorConstants.ERROR_CODE_404, Toast.LENGTH_LONG).show();
                    break;
            }

        }

    }


}
