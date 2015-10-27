package se.zavann.gasellmvvm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import se.zavann.gasellmvvm.Controllers.MainController;
import se.zavann.gasellmvvm.DTO.DtoCustomerInfo;
import se.zavann.gasellmvvm.Listeners.MainActivityListener;
import se.zavann.gasellmvvm.Views.MainView;

public class MainActivity extends AppCompatActivity implements MainActivityListener {

    private String customerId;
    private MainActivityListener listener;
    private MainView mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);

        listener = this;
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            this.customerId = extras.getString("customerId");
        }

        this.mainView = (MainView) findViewById(R.id.mainview);
        MainController controller = new MainController(this.listener);
        controller.setCustomerId(this.customerId);
        controller.getCustomerInfo();

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


    @Override
    public void onGetCustomerInfo(DtoCustomerInfo dtoCustomerInfo) {
        

        DtoCustomerInfo customerObject = dtoCustomerInfo;
        String text = customerObject.getFirstName()+" "+ customerObject.getLastName()+"\n";
        text += customerObject.getSocialId()+"\n";
        if(!customerObject.getCompanyName().equals("")){
            text += customerObject.getCompanyName()+"\n";
        }
        text += customerObject.getAddress()+"\n";
        text += customerObject.getZipCode()+" "+customerObject.getCity()+"\n";
        text += customerObject.getEmail()+"\n";
        text += customerObject.getHomePhone()+"\n";
        text += customerObject.getDayPhone()+"\n";
        text += customerObject.getCellPhone()+"\n";

        this.mainView.setCustomer(text);
    }


}
