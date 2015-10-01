package se.zavann.gasellmvvm.Controller;

import android.util.Log;
import android.view.View;

import se.zavann.gasellmvvm.ErrorConstants;
import se.zavann.gasellmvvm.Listeners.LoginControllerListener;
import se.zavann.gasellmvvm.View.LoginView;

/**
 * Created by Tom on 2015-05-21.
 */
public class LoginController implements View.OnClickListener {

    private final String TAG = "Login controller";
    private LoginView loginView;
    private LoginControllerListener listener;

    public LoginController(LoginView loginView, LoginControllerListener listner) {
        this.loginView = loginView;
        this.listener = listner;
    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "onClick"); //for searching if the action is being processed

        //Validate username and password before sending to logged in view
        if (loginView.getUsername().isEmpty() || loginView.getUsername().equals("")) {
            loginView.setUsernameError(ErrorConstants.USERNAME_IS_NOT_VALID);
        }else if (loginView.getPassword().isEmpty() || loginView.getPassword().equals("")) {
            loginView.setPasswordError(ErrorConstants.PASSWORD_IS_NOT_VALID);
        } else {
            listener.onLoginSuccess(); // do login process
        }

    }
}
