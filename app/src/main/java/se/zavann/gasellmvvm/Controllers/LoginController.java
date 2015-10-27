package se.zavann.gasellmvvm.Controllers;

import android.view.View;

import se.zavann.gasellmvvm.GasellRest;
import se.zavann.gasellmvvm.Listeners.LoginControllerListener;
import se.zavann.gasellmvvm.Listeners.RestCallListener;
import se.zavann.gasellmvvm.Listeners.RestListener;
import se.zavann.gasellmvvm.Views.LoginView;

/**
 * Created by Bullen on 2015-10-06.
 */
public class LoginController implements RestCallListener, View.OnClickListener{

    private LoginControllerListener listener;
    private GasellRest rest;
    private RestListener listen;
    private LoginView loginView;

    public LoginController(LoginView loginView, LoginControllerListener listener){

        this.rest = new GasellRest();
        this.listen = new RestListener(this);
        this.rest.addObserver(listen);
        this.listener = listener;
        this.loginView = loginView;

    }



    public void restCallback(){
        Object[] convertedObject = (Object[])listen.getObject();
        int resp = (int)convertedObject[1];
        switch (resp) {
            case -1:
                this.listener.onLoginFailed();
                break;
            case 0:
                this.listener.onApplicationError();
                break;
            case 1:
                this.listener.onLoginSuccess();
                break;
            default:
                this.listener.onServerNotResponding();
                break;
        }
    }


    @Override
    public void onClick(View v) {
        //do rest login

        if (this.loginView.getCustomerId().equals("") || this.loginView.getCustomerId().equals(null)) {
            listener.onLoginEmptyCall();
        } else if (this.loginView.getPassword().equals("") || this.loginView.getCustomerId().equals(null)) {
            listener.onLoginEmptyCall();
        } else {
            rest.login(this.loginView.getCustomerId(), this.loginView.getPassword());
        }

    }
}
