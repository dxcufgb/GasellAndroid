package se.zavann.gasellmvvm.Controllers;

import se.zavann.gasellmvvm.GasellRest;
import se.zavann.gasellmvvm.Listeners.LoginControllerListener;
import se.zavann.gasellmvvm.Listeners.RestCallListener;
import se.zavann.gasellmvvm.Listeners.RestListener;
import se.zavann.gasellmvvm.Models.Login;

/**
 * Created by Bullen on 2015-10-06.
 */
public class LoginController implements RestCallListener{

    private LoginControllerListener listener;
    private GasellRest rest;
    private RestListener listen;


    public LoginController(){

        rest = new GasellRest();
        listen = new RestListener(this);
        rest.addObserver(listen);

    }


    public void loginAction(Login login, LoginControllerListener listener) {
        //do rest login
        this.listener = listener;

        if (login.getUsername().equals("") || login.getUsername().equals(null)) {
            listener.onLoginEmptyCall();
        } else if (login.getPassword().equals("") || login.getPassword().equals(null)) {
            listener.onLoginEmptyCall();
        } else {
            rest.login(login.getUsername(), login.getPassword());
        }
    }


    public void restCallback(){
        Object[] convertedObject = (Object[])listen.getObject();
        int resp = (int)convertedObject[1];
        switch (resp) {
            case -1:
                listener.onLoginFailed();
                break;
            case 0:
                listener.onApplicationError();
                break;
            case 1:
                listener.onLoginSuccess();
                break;
            default:
                listener.onServerNotResponding();
                break;
        }
    }


}
