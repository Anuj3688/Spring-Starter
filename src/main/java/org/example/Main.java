package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Jai Shree Ram");
        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/config.xml");
        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1);
    }
}