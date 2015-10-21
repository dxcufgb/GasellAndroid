package se.zavann.gasellmvvm.Listeners;

import java.util.Observable;
import java.util.Observer;

import se.zavann.gasellmvvm.ViewModels.LoginVM;

/**
 * Created by Tom on 2015-10-20.
 */
public class RestListener implements Observer {
    private Object retObject;
    private RestCallListener callbackObject;

    private void setObject(Object object){
        this.retObject = object;
    }

    public Object getObject(){
        return this.retObject;
    }

    public RestListener(RestCallListener callbackObject){
        this.callbackObject = callbackObject;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.setObject(arg);
        callbackObject.restCallback();
    }

}
