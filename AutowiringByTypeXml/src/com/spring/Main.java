package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eraym on 20.07.2018.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Run runner = context.getBean("runner", Run.class);

        runner.internalCEngine();

        ((ClassPathXmlApplicationContext)context).close();
    }
}