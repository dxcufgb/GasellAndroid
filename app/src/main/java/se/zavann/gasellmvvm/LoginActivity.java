package se.zavann.gasellmvvm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

import se.zavann.gasellmvvm.Listeners.LoginVMListener;
import se.zavann.gasellmvvm.Models.Login;
import se.zavann.gasellmvvm.ViewModels.LoginVM;
import se.zavann.gasellmvvm.Views.LoginView;

/**
 * Created by Bullen on 2015-09-13.
 */
public class LoginActivity extends Activity implements LoginVMListener{

    private LoginView loginView;
    private LoginVMListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

        this.loginView = (LoginView) findViewById(R.id.login);
        listener = this;

        this.loginView.findViewById(R.id.btnLogin).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new LoginVM(
                        getApplicationContext(),
                        new Login(loginView.getCustomerId(), loginView.getPassword()),
                        listener);
            }
        });

    }


    @Override
    public void onLoginSuccess(){
        Intent intent = new Intent(this, MainActivity.class);
        //key, value
        intent.putExtra("customerId", ((LoginView) findViewById(R.id.login)).getCustomerId());
        this.startActivity(intent);
    }


}
