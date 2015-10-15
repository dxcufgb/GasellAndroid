package se.zavann.gasellmvvm.Controllers;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.mashape.unirest.http.Unirest;

import java.io.IOException;

import se.zavann.gasellmvvm.Listeners.MainActivityListener;
import se.zavann.gasellmvvm.LoginActivity;
import se.zavann.gasellmvvm.Models.Customer;

/**
 * Created by Bullen on 2015-10-08.
 */
public class MainController {

    private Context context;
    private Customer object;
    private MainActivityListener listener;

    //Constructor
    public MainController(Context context, Customer object, MainActivityListener listener) {
        this.context = context;
        this.object = object;
        this.listener = listener;

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

}
