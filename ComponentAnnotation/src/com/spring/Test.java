package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eraym on 21.07.2018.
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Address address = context.getBean("address", Address.class);

        address.setStreet("Duman Sokak");
        address.setNeighborhood("Esenevler Mahallesi");

        Worker worker = context.getBean("worker", Worker.class);

        worker.setFirstName("Eray");
        worker.setLastName("Mert");

        System.out.println(worker);

        ((ClassPathXmlApplicationContext)context).close();
    }
}
