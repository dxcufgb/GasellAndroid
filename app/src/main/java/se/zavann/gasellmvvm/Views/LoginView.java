package se.zavann.gasellmvvm.Views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import se.zavann.gasellmvvm.R;

/**
 * Created by Bullen on 2015-10-26.
 */
public class LoginView extends LinearLayout{


    public LoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setListeners(OnClickListener onClickListener) {
        findViewById(R.id.btnLogin).setOnClickListener(onClickListener);
    }

    public String getCustomerId() {
        return ((EditText) findViewById(R.id.etUsername)).getText().toString();
    }

    public String getPassword() {
        return ((EditText) findViewById(R.id.etPassword)).getText().toString();
    }

}
