package se.zavann.gasellmvvm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import se.zavann.gasellmvvm.Listeners.LoginVMListener;
import se.zavann.gasellmvvm.Models.Login;
import se.zavann.gasellmvvm.View.LoginView;
import se.zavann.gasellmvvm.ViewModels.LoginVM;

/**
 * Created by Bullen on 2015-09-13.
 */
public class LoginActivity extends Activity implements View.OnClickListener /*LoginVMListener*/ {

    private View.OnClickListener onClickListener;
    private EditText etUsername, etPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

        //Login controller according to:
        //https://github.com/KarinaSokolova/android-mvc-example
        /*
        LoginVM loginVm =
                new LoginVM((LoginView) this.findViewById(R.id.login), this);
        ((LoginView) this.findViewById(R.id.login)).setListeners(loginVm);
        */

        //etUsername = (EditText) findViewById(R.id.etUsername);
        //etPassword = (EditText) findViewById(R.id.etPassword);

        button = (Button) findViewById(R.id.btnLogin);
        button.setOnClickListener(this);

    }


    //@Override
    public void onLoginSuccess(){
        Log.i("Activity","onLoginSuccess nås!");
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLogin) {
            Toast.makeText(getApplicationContext(), "CLICK!", Toast.LENGTH_LONG).show();
        }
    }
}
