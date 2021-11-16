/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cuong
 */
public class Address {
    private String noHome;
    private String street;
    private String district;
    private String city;

    public Address(String noHome, String street, String district, String city) {
        this.noHome = noHome;
        this.street = street;
        this.district = district;
        this.city = city;
    }

    public String getNoHome() {
        return noHome;
    }

    public void setNoHome(String noHome) {
        this.noHome = noHome;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
        
}
