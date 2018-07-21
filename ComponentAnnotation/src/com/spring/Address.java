package com.spring;

import org.springframework.stereotype.Component;

/**
 * Created by eraym on 21.07.2018.
 */

@Component
public class Address {

    private String street;
    private String neighborhood;

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
