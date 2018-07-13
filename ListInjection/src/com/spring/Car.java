package com.spring;

/**
 * Created by eraym on 13.07.2018.
 */
public class Car {
    private String brand;
    private String model;
    private String segment;

    public Car(){

    }

    public Car(String brand, String model, String segment){
        this.brand = brand;
        this.model = model;
        this.segment = segment;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getSegment(){
        return segment;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", segment='" + segment + '\'' +
                '}';
    }
}
