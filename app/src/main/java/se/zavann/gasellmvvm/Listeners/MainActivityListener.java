package se.zavann.gasellmvvm.Listeners;

import se.zavann.gasellmvvm.DTO.DTOCustomerInfo;

/**
 * Created by Bullen on 2015-10-08.
 */
public interface MainActivityListener {

    public void onLogout();
    public void onGetCustomerInfo(DTOCustomerInfo dtoCustomerInfo);

}
