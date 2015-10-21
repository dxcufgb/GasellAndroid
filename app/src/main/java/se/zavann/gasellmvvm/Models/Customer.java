package se.zavann.gasellmvvm.Models;

import android.content.Context;

/**
 * Created by Tom on 2015-05-21.
 */
public class Customer {

    //instance variables
    private String customerId;

    //main constructor
    public Customer(String customerId){
        this.customerId = customerId;
    }

    public String getCustomerId(){
        return this.customerId;
    }
}
