package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jai Shree Ram");
        ApplicationContext context = new ClassPathXmlApplicationContext("java/org/spring/config.xml");
        Student s2 = (Student) context.getBean("student2");
        System.out.println(s2);
        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1);
    }
}