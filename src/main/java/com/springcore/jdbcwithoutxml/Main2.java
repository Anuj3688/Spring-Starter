package com.springcore.jdbcwithoutxml;

import com.springcore.jdbcwithoutxml.Student;
import com.springcore.jdbcwithoutxml.StudentHub;
import com.springcore.jdbcwithoutxml.StudentImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

//Best Method of Implementation
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Implementing best method");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentHub sh = context.getBean("studentImp", StudentImpl.class);


        System.out.println(sh.getStudent(131));
        List<Student> s = sh.getStudents();
        System.out.println(s);
        for (Student s1:s){
            System.out.println(s1);
        }

    }
}
