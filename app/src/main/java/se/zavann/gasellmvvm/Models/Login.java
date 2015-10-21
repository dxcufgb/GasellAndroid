package se.zavann.gasellmvvm.Models;

/**
 * Created by Bullen on 2015-10-09.
 */
public class Login {

    private String username, password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
