package se.zavann.gasellmvvm.ViewModels;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import se.zavann.gasellmvvm.DTO.DTOLogin;
import se.zavann.gasellmvvm.ErrorConstants;
import se.zavann.gasellmvvm.Listeners.LoginVMListener;
import se.zavann.gasellmvvm.Models.Login;
import se.zavann.gasellmvvm.R;
import se.zavann.gasellmvvm.View.LoginView;

/**
 * Created by Bullen on 2015-10-06.
 */
public class LoginVM {

    private LoginVMListener listener;
    private LinearLayout linearLayout;

    private Context context;
    //private ArrayList<View> viewList;
    private Login loginObj;


    public LoginVM(Context context/*, ArrayList<View> viewList*/, final Login loginObj){
        this.context = context;
        //this.viewList = viewList;
        this.loginObj = loginObj;

        //set layout via
        //this.linearLayout = new LinearLayout(context);



                //EditText etUsername = (EditText)v.findViewById(R.id.etUsername);
                //EditText etPassword = (EditText)v.findViewById(R.id.etPassword);

                //TODO: add DTO actions
                if (loginObj.getUsername().equals("") || loginObj.getUsername().equals(null)) {
                    //send error message
                    Toast.makeText(context, ErrorConstants.USERNAME_IS_NOT_VALID, Toast.LENGTH_LONG).show();
                } else if (loginObj.getPassword().equals("") || loginObj.getPassword().equals(null)) {
                    //send error message
                    Toast.makeText(context, ErrorConstants.PASSWORD_IS_NOT_VALID, Toast.LENGTH_LONG).show();
                } else {
                    //DTOLogin dto = new DTOLogin(loginObj.getUsername().toString(), loginObj.getPassword().toString());

                    //if () {
                    listener.onLoginSuccess();
                    //} else {
                    //    Toast.makeText(v.getContext(), ErrorConstants.ERROR_CODE_101, Toast.LENGTH_LONG).show();
                    //}
                }

    }


    /*
    public LoginVM(LoginView loginView, LoginVMListener listener) {
        this.loginView = loginView;
        this.listener = listener;
    }*/


/*
    @Override
    public void onClick(View v) {


        Log.i("VM","Login ViewModel Click");
        //Validate username and password before sending to logged in view
        if (loginView.getUsername().isEmpty() || loginView.getUsername().equals("")) {
            loginView.setUsernameError(ErrorConstants.USERNAME_IS_NOT_VALID);
        }else if (loginView.getPassword().isEmpty() || loginView.getPassword().equals("")) {
            loginView.setPasswordError(ErrorConstants.PASSWORD_IS_NOT_VALID);
        } else {
            if dto login return statement is true/false, 1/0
            if (login(loginView.getUsername(), loginView.getPassword()) == 1) {
                listener.onLoginSuccess(); // do login process
            } else {
                loginView.setUsernameError(ErrorConstants.ERROR_CODE_101);
            }
            listener.onLoginSuccess(); // do login process
        }


    }
*/
    //Login process is started here
    private int login(String username, String password) {

        return 0;
    }

}
