package se.zavann.gasellmvvm.ViewModels;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.mashape.unirest.http.Unirest;

import java.io.IOException;
import java.lang.Object;
import java.util.ArrayList;

import se.zavann.gasellmvvm.DTO.DTOCustomerInfo;
import se.zavann.gasellmvvm.GasellRest;
import se.zavann.gasellmvvm.Listeners.MainActivityListener;
import se.zavann.gasellmvvm.Listeners.RestCallListener;
import se.zavann.gasellmvvm.Listeners.RestListener;
import se.zavann.gasellmvvm.LoginActivity;
import se.zavann.gasellmvvm.Models.Customer;

/**
 * Created by Bullen on 2015-10-08.
 */
public class MainActivityVM implements RestCallListener{


    private Context context;
    private Customer object;
    private MainActivityListener listener;
    //interface supplied, see AndroidRest.
    private GasellRest rest;
    private RestListener listen;

    //Constructor
    public MainActivityVM(Context context, Customer object/*, MainActivityListener listener*/) {
        this.context = context;
        this.object = object;
        //this.listener = listener;

        //do rest call to get customer data
        rest = new GasellRest();
        listen = new RestListener(this);
        rest.addObserver(listen);
        rest.getCustomerInfo(object.getCustomerId());

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
    public void restCallback() {
        Object[] convertedObject = (Object[]) listen.getObject();
        DTOCustomerInfo customerObject = (DTOCustomerInfo)convertedObject[1];
        listener.onGetCustomerInfo(customerObject);
    }
}
