package se.zavann.gasellmvvm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import se.zavann.gasellmvvm.DTO.DTOLogin;
import se.zavann.gasellmvvm.Listeners.LoginVMListener;
import se.zavann.gasellmvvm.Models.Login;
import se.zavann.gasellmvvm.View.LoginView;
import se.zavann.gasellmvvm.ViewModels.LoginVM;

/**
 * Created by Bullen on 2015-09-13.
 */
public class LoginActivity extends Activity implements LoginVMListener{

    private EditText etUsername, etPassword;
    private Button button;
    private LoginVMListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

        listener = this;
        init();

    }


    @Override
    public void onLoginSuccess(){
        Intent intent = new Intent(this, MainActivity.class);
        //key, value
        intent.putExtra("customerId", this.etUsername.getText().toString());
        this.startActivity(intent);
    }

    public void init() {
        //init views
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        button = (Button) findViewById(R.id.btnLogin);

        //button actions
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "CLICK!", Toast.LENGTH_LONG).show();

                new LoginVM(getApplicationContext(),
                        new Login(etUsername.getText().toString(),
                                etPassword.getText().toString()),
                        listener);
            }
        });


    }


}
