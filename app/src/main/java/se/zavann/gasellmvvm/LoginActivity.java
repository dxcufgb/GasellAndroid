package se.zavann.gasellmvvm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import se.zavann.gasellmvvm.Listeners.LoginControllerListener;
import se.zavann.gasellmvvm.Controllers.LoginController;
import se.zavann.gasellmvvm.Views.LoginView;

/**
 * Created by Bullen on 2015-09-13.
 */
public class LoginActivity extends Activity implements LoginControllerListener {

    private LoginView loginView;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

        LoginController loginController = new LoginController((LoginView) this.findViewById(R.id.login),this);
        this.loginView = (LoginView) this.findViewById(R.id.login);
        this.loginView.setListeners(loginController);


    }


    @Override
    public void onLoginSuccess(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("customerId", this.loginView.getCustomerId());
        this.startActivity(intent);
    }

    @Override
    public void onLoginFailed() {
        Toast.makeText(LoginActivity.this, ErrorConstants.ERROR_CODE_101, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginEmptyCall() {
        Toast.makeText(LoginActivity.this, ErrorConstants.USERNAME_OR_PASSWORD_IS_EMPTY, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onApplicationError() {
        Toast.makeText(LoginActivity.this, ErrorConstants.ERROR_CODE_100, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onServerNotResponding() {
        Toast.makeText(LoginActivity.this, ErrorConstants.ERROR_CODE_404, Toast.LENGTH_SHORT).show();
    }


}
