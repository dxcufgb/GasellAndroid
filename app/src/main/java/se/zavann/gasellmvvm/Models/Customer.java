package se.zavann.gasellmvvm.Models;

/**
 * Created by Tom on 2015-05-21.
 */
public class Customer {

    private int id;
    private String username;
    private String password;
    private String name;
    private long personal_id;
    private String contract;

    public Customer(int id, long personal_id, String username, String password, String name){
        this.id = id;
        this.personal_id = personal_id;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setPersonalId(long personal_id){
        this.personal_id = personal_id;
    }

    public long getPersonalId(){
        return this.personal_id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    //TODO: detta kanns osakert, maste se over eller andra sa det dols totalt.
    public String getPassword(){
        return this.password;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
