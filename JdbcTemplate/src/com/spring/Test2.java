package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eraym on 22.07.2018.
 */
public class Test2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        DaoNameParameter nameParameter = context.getBean("javaManDao2", DaoNameParameter.class);

        System.out.println("All data");

        for (JavaMan javaMan: nameParameter.manList()){
            System.out.println(javaMan);
        }

        System.out.println("Insert operation");

        nameParameter.create(new JavaMan(10, "Ali", "Tulum"));

        for (JavaMan javaMan: nameParameter.manList()){
            System.out.println(javaMan);
        }


        ((ClassPathXmlApplicationContext)context).close();
    }
}
