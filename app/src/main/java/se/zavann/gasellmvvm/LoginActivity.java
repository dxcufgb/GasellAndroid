package se.zavann.gasellmvvm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import se.zavann.gasellmvvm.Listeners.LoginControllerListener;
import se.zavann.gasellmvvm.Models.Login;
import se.zavann.gasellmvvm.Controllers.LoginController;

/**
 * Created by Bullen on 2015-09-13.
 */
public class LoginActivity extends Activity implements LoginControllerListener {

    private EditText etUsername, etPassword;
    private Button button;
    private LoginControllerListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

        listener = this;
        init();

    }


    @Override
    public void onLoginSuccess(){
        Log.i("Activity","onLoginSuccess nås!");
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

                new LoginController(getApplicationContext(),
                        new Login(etUsername.getText().toString(),
                                etPassword.getText().toString()),
                        listener);
            }
        });


    }


}
