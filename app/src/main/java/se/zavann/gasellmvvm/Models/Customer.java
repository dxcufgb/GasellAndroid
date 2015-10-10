package se.zavann.gasellmvvm.Models;

import android.content.Context;

/**
 * Created by Tom on 2015-05-21.
 */
public class Customer {

    //instance variables
    private String
            customerId,
            firstName,
            lastName,
            email,
            companyName,
            socialId,
            address,
            zipCode,
            city,
            dayPhone,
            homePhone,
            cellPhone;

    //main constructor
    public Customer(String customerId, String firstName, String lastName, String email
        , String companyName, String socialId, String address, String zipCode, String city
        , String dayPhone, String homePhone, String cellPhone){

        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.companyName = companyName;
        this.socialId = socialId;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.dayPhone = dayPhone;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;

    }

    //empty constructor for instantiations
    public Customer(){};

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDayPhone() {
        return dayPhone;
    }

    public void setDayPhone(String dayPhone) {
        this.dayPhone = dayPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
}
