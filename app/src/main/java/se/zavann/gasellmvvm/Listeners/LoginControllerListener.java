package se.zavann.gasellmvvm.Listeners;

/**
 * Created by Tom on 2015-05-21.
 */
public interface LoginControllerListener {

    /**
     * The method is called by Login controller to inform the
     * Login Activity about the successful login
     */
    public void onLoginSuccess();
    public void onLoginFailed();
    public void onLoginEmptyCall();
    public void onApplicationError();
    public void onServerNotResponding();

}
