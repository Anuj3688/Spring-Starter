package com.springcore.jdbcwithoutxml;

import com.springcore.jdbcwithoutxml.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentImpl implements StudentHub{
    private JdbcTemplate jdbcTemplate;


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(com.springcore.jdbcwithoutxml.Student student) {
        return 0;
    }

    @Override
    public List<com.springcore.jdbcwithoutxml.Student> getStudents() {
        String query = "Select * from Student";
        List<Student> sh = jdbcTemplate.query(query,new RowMapperImpel());
        return sh;
    }

    @Override
    public int update(com.springcore.jdbcwithoutxml.Student student) {
        String query = "Update Student set name = ? , city =? where id = ?";
        int r = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return r;
    }
    @Override
    public Student getStudent(int id) {
        String query = "Select * from student where id = ?";
        RowMapper<Student> rowMapper = new RowMapperImpel();
        Student student=jdbcTemplate.queryForObject(query,rowMapper,id);
        return student;
    }
}
