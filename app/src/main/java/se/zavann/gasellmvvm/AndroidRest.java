/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.zavann.gasellmvvm;

/**
 *
 * @author Tom
 */
public interface AndroidRest {

    public void login(String login, String passwd);
    public void getCustomerInfo(String customerId);
}
