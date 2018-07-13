package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eraym on 13.07.2018.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Cars cars = context.getBean("cars", Cars.class);
        System.out.println(cars.toString());

        ((ClassPathXmlApplicationContext)context).close();
    }
}
