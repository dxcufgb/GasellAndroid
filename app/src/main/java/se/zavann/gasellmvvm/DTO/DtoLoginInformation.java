package se.zavann.gasellmvvm.DTO;

/**
 * Created by Tom on 2015-05-24.
 */
public class DtoLoginInformation {
    private String login;
    private String passwd;

    public DtoLoginInformation(String login, String passwd) {
        this.login = login;
        this.passwd = passwd;
    }
}
