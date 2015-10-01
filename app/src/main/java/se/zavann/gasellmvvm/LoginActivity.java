package se.zavann.gasellmvvm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import se.zavann.gasellmvvm.Controller.LoginController;
import se.zavann.gasellmvvm.Listeners.LoginControllerListener;
import se.zavann.gasellmvvm.View.LoginView;

/**
 * Created by Bullen on 2015-09-13.
 */
public class LoginActivity extends FragmentActivity implements LoginControllerListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

        //Login controller according to:
        //https://github.com/KarinaSokolova/android-mvc-example
        LoginController loginController =
                new LoginController((LoginView) this.findViewById(R.id.login), this);
    }

    @Override
    public void onLoginSuccess(){
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }

}
