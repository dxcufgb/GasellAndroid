package se.zavann.gasellmvvm;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import se.zavann.gasellmvvm.DTO.DtoCustomerInfo;
import se.zavann.gasellmvvm.Listeners.MainActivityListener;
import se.zavann.gasellmvvm.Models.Customer;

public class MainActivity extends ActionBarActivity /*implements MainActivityListener*/{

    private TextView twWelcome;
    //interface supplied, see AndroidRest.
    private GasellRest rest = new GasellRest();
    private String customerId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);

        this.twWelcome = (TextView)findViewById(R.id.twwelcome);

        //get data from login
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.customerId = extras.getString("customerId");
            DtoCustomerInfo customerObject = rest.getCustomerInfo(this.customerId);
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

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
