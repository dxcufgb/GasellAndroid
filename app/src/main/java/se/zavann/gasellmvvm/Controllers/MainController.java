package se.zavann.gasellmvvm.Controllers;

import android.content.Context;

import se.zavann.gasellmvvm.DTO.DtoCustomerInfo;
import se.zavann.gasellmvvm.GasellRest;
import se.zavann.gasellmvvm.Listeners.MainActivityListener;
import se.zavann.gasellmvvm.Listeners.RestCallListener;
import se.zavann.gasellmvvm.Listeners.RestListener;
import se.zavann.gasellmvvm.Models.Customer;

/**
 * Created by Bullen on 2015-10-08.
 */
public class MainController implements RestCallListener {

    private Context context;
    private Customer object;
    private MainActivityListener listener;
    private GasellRest rest;
    private RestListener listen;

    //Constructor
    public MainController() {}


    public void getCustomerInfo(MainActivityListener listener, String customerId) {
        this.listener = listener;

        rest = new GasellRest();
        listen = new RestListener(this);
        rest.addObserver(listen);
        rest.getCustomerInfo(customerId);
    }


    @Override
    public void restCallback() {
        Object[] convertedObject = (Object[]) listen.getObject();
        DtoCustomerInfo customerObject = (DtoCustomerInfo)convertedObject[1];
        listener.onGetCustomerInfo(customerObject);
    }


}
