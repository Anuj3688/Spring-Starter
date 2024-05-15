package com.springcore.stereo;

import com.springcore.stereo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Looking At Autowiring");
        System.out.println("Also seeing Singeltone scope below");
        ApplicationContext context =  new ClassPathXmlApplicationContext("java/com/springcore/stereo/Stereo.xml");
        Employee e= context.getBean("employee",Employee.class);
        Employee e9 = context.getBean("employee",Employee.class);
        System.out.println(e);
        System.out.println(e9.hashCode());
        System.out.println(e.hashCode());

//        Showing how there can be different hash code when using prototype Scope
        Employee_prototype e1 = context.getBean("EP",Employee_prototype.class);
        Employee_prototype e2 = context.getBean("EP",Employee_prototype.class);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
