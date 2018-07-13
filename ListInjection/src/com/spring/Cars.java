package com.spring;

import java.util.List;

/**
 * Created by eraym on 13.07.2018.
 */
public class Cars {

    private List<Car> cars;

    public Cars(List<Car> cars){
        this.cars = cars;
    }

    public String toString(){
        String list ="";

        for (Car car : cars)
        {
            list += car + "\n";
        }

        return list;
    }
}
