package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by eraym on 22.07.2018.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        JavaDao dao = context.getBean("javacilar",JavaDao.class);

        List<Javaci> javacilar = dao.javaciList();

        for (Javaci javaci:javacilar)
        {
            System.out.println(javaci);
        }

        ((ClassPathXmlApplicationContext)context).close();
    }
}
