package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // TODO: The Below code if for xml config for destroy and init
//        As You can see now we are using AbstractApplicationContext just because we wanna registerShutdownHook which will lead to the call of destroy method
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("java/com/springcore/lifecycle/lifecycle.xml");
        //Calling this method so that the context should know that there is a destroy function that needs to be called.
        context.registerShutdownHook();
        Food f1 = (Food)context.getBean("f1");
        System.out.println(f1);

        // TODO: The below code is for init & Destroy using interface
        ApplicationContext context1 = new ClassPathXmlApplicationContext("java/com/springcore/lifecycle/lifecycle.xml");
        Drinks d1 = (Drinks) context1.getBean("d1");
        System.out.println(d1);

        // TODO: Using the 3rd method using Annotation
        // Here we need to make sure that your config file setup is done properly
        Deserts d = (Deserts) context1.getBean("d");
        System.out.println(d);

    }
}
