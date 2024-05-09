package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jai Shree Ram");
        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/org/example/config.xml");
        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1);
    }
}