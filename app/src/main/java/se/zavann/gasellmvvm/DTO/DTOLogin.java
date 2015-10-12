package se.zavann.gasellmvvm.DTO;

/**
 * Created by Bullen on 2015-10-10.
 */
public class DTOLogin {

    private String username, password;

    public DTOLogin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
