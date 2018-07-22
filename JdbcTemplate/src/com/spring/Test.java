package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eraym on 22.07.2018.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        JavaManDao javaManDao = context.getBean("javaManDao", JavaManDao.class);
        System.out.println(javaManDao.getJavaMan(3));

        System.out.println("All data show");

        for (JavaMan javaMan:javaManDao.javaManList())
        {
            System.out.println(javaMan);
        }

        System.out.println("insert operation");

        javaManDao.createJavaMan("Umut", "Sezer");

        for (JavaMan javaMan:javaManDao.javaManList())
        {
            System.out.println(javaMan);
        }

        ((ClassPathXmlApplicationContext)context).close();
    }
}
