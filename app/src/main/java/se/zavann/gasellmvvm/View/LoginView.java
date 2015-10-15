package se.zavann.gasellmvvm.View;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;

import se.zavann.gasellmvvm.R;

/**
 * Created by Bullen on 2015-09-13.
 */
public class LoginView extends LinearLayout {

    public LoginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    //click listener for login button
    public void setListeners(OnClickListener onClickListener) {
        Log.i("View", "Clicking button!");
        findViewById(R.id.btnLogin).setOnClickListener(onClickListener);
    }

    //return view items
    public String getUsername() {
        return ((EditText)this.findViewById(R.id.etUsername)).getText().toString();
    }

    public String getPassword() {
        return ((EditText)this.findViewById(R.id.etPassword)).getText().toString();
    }

    public void setUsernameError(String error) {
        ((EditText) this.findViewById(R.id.etUsername)).setError(error);
    }

    public void setPasswordError(String error) {
        ((EditText) this.findViewById(R.id.etPassword)).setError(error);
    }

}
