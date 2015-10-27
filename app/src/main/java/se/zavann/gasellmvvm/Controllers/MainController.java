package se.zavann.gasellmvvm.Controllers;

import se.zavann.gasellmvvm.DTO.DtoCustomerInfo;
import se.zavann.gasellmvvm.GasellRest;
import se.zavann.gasellmvvm.Listeners.MainActivityListener;
import se.zavann.gasellmvvm.Listeners.RestCallListener;
import se.zavann.gasellmvvm.Listeners.RestListener;

/**
 * Created by Bullen on 2015-10-08.
 */
public class MainController implements RestCallListener {

    private MainActivityListener listener;
    private GasellRest rest;
    private RestListener listen;
    private String customerId;

    //Constructor
    public MainController( MainActivityListener listener) {

        this.listener = listener;

    }

    public void setCustomerId(String id) {
        this.customerId = id;
    }

    public void getCustomerInfo() {
        rest = new GasellRest();
        listen = new RestListener(this);
        rest.addObserver(listen);
        rest.getCustomerInfo(this.customerId);
    }


    @Override
    public void restCallback() {
        Object[] convertedObject = (Object[]) listen.getObject();
        DtoCustomerInfo customerObject = (DtoCustomerInfo)convertedObject[1];
        listener.onGetCustomerInfo(customerObject);
    }


}
