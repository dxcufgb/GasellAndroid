/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidrestinterface;

/**
 *
 * @author Tom
 */
public class DtoSiteInfo {
    private final String siteId;
    private String address;
    private String city;
    private String zipCode;
    private String organizationId;
    private String consumption;

    public DtoSiteInfo(String siteId){
        this.siteId = siteId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }
    
    public String getSiteId() {
        return siteId;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getConsumption() {
        return consumption;
    }
}
