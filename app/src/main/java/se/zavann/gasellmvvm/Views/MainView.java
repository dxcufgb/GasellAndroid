package se.zavann.gasellmvvm.Views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import se.zavann.gasellmvvm.R;

/**
 * Created by Bullen on 2015-10-26.
 */
public class MainView extends LinearLayout{


    public MainView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setCustomer(String customerText) {
        Log.i("View", "Sätter text!");
        ((EditText) findViewById(R.id.twwelcome)).setText(customerText);
    }

}
