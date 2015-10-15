package se.zavann.gasellmvvm;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import se.zavann.gasellmvvm.DTO.DtoCustomerInfo;
import se.zavann.gasellmvvm.Listeners.MainActivityListener;
import se.zavann.gasellmvvm.Models.Customer;
import se.zavann.gasellmvvm.ViewModels.MainActivityVM;

public class MainActivity extends ActionBarActivity {

    private TextView twWelcome;
    private MenuItem item_logout;
    //interface supplied, see AndroidRest.
    private GasellRest rest;
    private String customerId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);

        rest = new GasellRest();
        this.twWelcome = (TextView)findViewById(R.id.twwelcome);

        //get data from login
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.customerId = extras.getString("customerId");
            DtoCustomerInfo customerObject = this.rest.getCustomerInfo(this.customerId);
            String text = customerObject.getFirstName()
                    + " "
                    + customerObject.getLastName();
            this.twWelcome.setText(text);
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            //do logout
            new MainActivityVM(getApplicationContext(),null).Logout();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
