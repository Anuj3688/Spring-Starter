package com.springcore.stereo;

import com.springcore.stereo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Looking At Autowiring");
        ApplicationContext context =  new ClassPathXmlApplicationContext("java/com/springcore/stereo/Stereo.xml");
        Employee e= context.getBean("employee",Employee.class);
        System.out.println(e);
    }
}
