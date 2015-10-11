package se.zavann.gasellmvvm.ViewModels;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.mashape.unirest.http.Unirest;

import java.io.IOException;
import java.lang.Object;
import java.util.ArrayList;

import se.zavann.gasellmvvm.LoginActivity;
import se.zavann.gasellmvvm.Models.Customer;

/**
 * Created by Bullen on 2015-10-08.
 */
public class MainActivityVM {

    private Context context;
    private Customer object;

    //Constructor
    public MainActivityVM(Context context, Customer object) {
        this.context = context;
        this.object = object;

        
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
