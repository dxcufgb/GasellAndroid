package se.zavann.gasellmvvm.ViewModels;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.mashape.unirest.http.Unirest;

import java.io.IOException;
import java.lang.Object;
import java.util.ArrayList;

import se.zavann.gasellmvvm.Listeners.MainActivityListener;
import se.zavann.gasellmvvm.Listeners.ModelListener;
import se.zavann.gasellmvvm.LoginActivity;
import se.zavann.gasellmvvm.Models.Customer;

/**
 * Created by Bullen on 2015-10-08.
 */
public class MainActivityVM extends Customer implements ModelListener{

    private Context context;
    private Customer object;
    private MainActivityListener listener;

    //Constructor
    public MainActivityVM(Context context, Customer object/*, MainActivityListener listener*/) {
        this.context = context;
        this.object = object;
        //this.listener = listener;

        //do rest call to get customer data
        

    }


    public void Logout(){
        try {
            Unirest.shutdown();
            //return to login with no connection stream up
            Intent intent = new Intent(this.context, LoginActivity.class);
            this.context.startActivity(intent);
        } catch (IOException e) {
            Log.i("Logout", e.getMessage());
        }
    }


    @Override
    public void onUpdateCustomerInfo() {
        this.object.getCustomerId();
        this.object.getFirstName();
        this.object.getLastName();
        this.object.getEmail();
        this.object.getCompanyName();
        this.object.getSocialId();
        this.object.getZipCode();
        this.object.getAddress();
        this.object.getCity();
        this.object.getDayPhone();
        this.object.getHomePhone();
        this.object.getCellPhone();
    }
}
