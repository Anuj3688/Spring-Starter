package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("java/com/springcore/jdbc/config.xml");
        JdbcTemplate jd = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String query = "Insert into student(id,name,city) values (?,?,?)";
        int result = jd.update(query,21,"Rama","Lucknow");
        System.out.println("Results are :"+result);
    }
}
