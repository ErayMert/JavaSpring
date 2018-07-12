package com.spring;

/**
 * Created by eraym on 12.07.2018.
 */
public class Address {
    private String street;
    private String neighborhood;

    public Address(){

    }

    public Address(String street, String neighborhood) {
        this.street = street;
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                '}';
    }
}
