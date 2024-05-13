package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Looking At Autowiring");
        ApplicationContext context =  new ClassPathXmlApplicationContext("java/com/springcore/autowiring/config.xml");
        Employee e= context.getBean("E1",Employee.class);
        System.out.println(e);
    }
}
