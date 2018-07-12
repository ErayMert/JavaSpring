package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eraym on 12.07.2018.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Worker w1 = context.getBean("worker1", Worker.class);

        System.out.println(w1);

        Worker w2 = context.getBean("worker2", Worker.class);
        System.out.println(w2);

        ((ClassPathXmlApplicationContext)context).close();
    }
}
