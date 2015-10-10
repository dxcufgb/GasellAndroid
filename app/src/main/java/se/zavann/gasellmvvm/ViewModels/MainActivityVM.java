package se.zavann.gasellmvvm.ViewModels;

import android.content.Context;
import android.view.View;

import java.lang.Object;
import java.util.ArrayList;

import se.zavann.gasellmvvm.Models.Customer;

/**
 * Created by Bullen on 2015-10-08.
 */
public class MainActivityVM {

    private Customer customer;
    private ArrayList<Customer> customerList;
    //main vars
    private Context context;
    private ArrayList<View> viewList;
    private Object object;

    //Constructor
    public MainActivityVM(Context context, ArrayList<View> viewList, Object object) {
        this.context = context;
        this.viewList = viewList;
        this.object = object;
    }

    //Get all customers
    public ArrayList<Customer> getAllCustomers() {
        customerList = new ArrayList<>();


        return customerList;
    }

    //set single customer
    public void setNewCustomer(Customer customer) {
        this.customer = customer;
    }

    //Get single customer
    public Customer getNewCustomer() {
        return customer;
    }

}
