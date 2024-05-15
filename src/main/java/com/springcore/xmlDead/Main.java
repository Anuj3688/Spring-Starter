package com.springcore.xmlDead;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Removed XmL");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        DataHub d = context.getBean("getDataHub", DataHub.class);
        d.print();
    }
}
