/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.zavann.gasellmvvm;

import se.zavann.gasellmvvm.DTO.DtoContractInfo;
import se.zavann.gasellmvvm.DTO.DtoCustomerInfo;
import se.zavann.gasellmvvm.DTO.DtoSiteInfo;

/**
 *
 * @author Tom
 */
public interface AndroidRest {

    public int login(String login, String passwd);
    public DtoCustomerInfo getCustomerInfo(String customerId);
    public DtoSiteInfo getSiteInfo(String siteId, String customerId);
    public DtoContractInfo getContractInfo(String ContractId, String customerId, String siteId);
    
}
