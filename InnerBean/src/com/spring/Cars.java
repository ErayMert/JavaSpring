package com.spring;

import java.util.List;

/**
 * Created by eraym on 13.07.2018.
 */
public class Cars {

    private Car fastestCar;
    private List<Car> cars;

    public Cars(){

    }

    public Car getFastestCar() {
        return fastestCar;
    }

    public void setFastestCar(Car fastestCar) {
        this.fastestCar = fastestCar;
    }

    public Cars(List<Car> cars){
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String toString(){
        String list ="The fastest car: \n" + fastestCar + "\n\nOther Cars: \n";

        for (Car car : cars)
        {
            list += car + "\n";
        }

        return list;
    }
}
