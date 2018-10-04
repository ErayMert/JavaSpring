package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eraym on 28.07.2018.
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Employee employeeA = context.getBean("employeeBean" , Employee.class);

        System.out.println(employeeA);

        Employee employeeB = context.getBean("indianEmployee" , Employee.class);

        System.out.println(employeeB);

    }
}
