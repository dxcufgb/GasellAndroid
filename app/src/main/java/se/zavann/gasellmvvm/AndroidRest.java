/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.zavann.gasellmvvm;

import se.zavann.gasellmvvm.DTO.DtoCustomerInfo;

/**
 *
 * @author Tom
 */
public interface AndroidRest {

    public Integer login(String login, String passwd);
    public DtoCustomerInfo getCustomerInfo(String customerId);
}
