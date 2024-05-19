package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

//Best Method of Implementation
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Implementing best method");
        ApplicationContext context = new ClassPathXmlApplicationContext("java/com/springcore/jdbcwithout/config.xml");
        StudentHub sh = context.getBean("ds2",StudentImpl.class);

//        Student student = new Student();
//        student.setCity("banaras");
//        student.setId(131);
//        student.setName("Panwadi");
//        int r = sh.update(student);
//        System.out.println("Result is:"+r);
        System.out.println(sh.getStudent(131));
        List<Student> s = sh.getStudents();
        System.out.println(s);
        for (Student s1:s){
            System.out.println(s1);
        }

    }
}
