package se.zavann.gasellmvvm.Controllers;

import android.content.Context;
import android.util.Log;

import se.zavann.gasellmvvm.DTO.DtoCustomerInfo;
import se.zavann.gasellmvvm.GasellRest;
import se.zavann.gasellmvvm.Listeners.MainActivityListener;
import se.zavann.gasellmvvm.Listeners.RestCallListener;
import se.zavann.gasellmvvm.Listeners.RestListener;
import se.zavann.gasellmvvm.Models.Customer;
import se.zavann.gasellmvvm.Views.MainView;

/**
 * Created by Bullen on 2015-10-08.
 */
public class MainController implements RestCallListener {

    private Context context;
    private Customer object;
    private MainActivityListener listener;
    private GasellRest rest;
    private RestListener listen;
    private String customerId;

    //Constructor
    public MainController( MainActivityListener listener) {

        this.listener = listener;
        getCustomerInfo();

    }

    public void setCustomerId(String id) {
        this.customerId = id;
    }

    private void getCustomerInfo() {
        rest = new GasellRest();
        listen = new RestListener(this);
        rest.addObserver(listen);
        rest.getCustomerInfo(this.customerId);
    }


    @Override
    public void restCallback() {
        Log.i("Controller", "restCallBack kallas!");
        Object[] convertedObject = (Object[]) listen.getObject();
        DtoCustomerInfo customerObject = (DtoCustomerInfo)convertedObject[1];
        listener.onGetCustomerInfo(customerObject);
    }


}
