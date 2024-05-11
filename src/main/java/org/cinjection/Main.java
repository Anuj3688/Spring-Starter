package org.cinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("We will see how constructor Injection works in this class");
        ApplicationContext context = new ClassPathXmlApplicationContext("java/org/cinjection/cinject.xml");
        Employee e = (Employee) context.getBean("e1");
        System.out.println(e);
    }
}
