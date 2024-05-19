package com.springcore.jdbcwithoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class JdbcConfig {
    @Bean(name = {"ds"})
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setPassword("JSRam@101");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dataSource.setUsername("root");
        return dataSource;
    }

    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getTemplate(){
        JdbcTemplate jd = new JdbcTemplate();
        jd.setDataSource(getDataSource());
        return jd;
    }

    @Bean(name = {"studentImp"})
    public StudentImpl getStudenthub(){
        StudentImpl s1 = new StudentImpl();
        s1.setJdbcTemplate(getTemplate());
        return s1;
    }
}
