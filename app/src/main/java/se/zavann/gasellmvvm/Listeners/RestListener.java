package se.zavann.gasellmvvm.Listeners;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Tom on 2015-10-20.
 */
public class RestListener implements Observer {

    private Object callbackObject;

    public RestListener(Object callbackObject){
        this.callbackObject = callbackObject;
    }

    @Override
    public void update(Observable o, Object arg) {
        callbackObject.restCallback(arg);
    }

}
