package com.springcore.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentImpl implements StudentHub {
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        String query = "Insert into Student(id,name,city) values(?,?,?)";
        int result= jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    @Override
    public List<Student> getStudents() {
        String query = "Select * from Student";
        List<Student> sh = jdbcTemplate.query(query,new RowMapperImpel());
        return sh;
    }

    @Override
    public Student getStudent(int id) {
        String query = "Select * from student where id = ?";
        RowMapper<Student> rowMapper = new RowMapperImpel();
        Student student=jdbcTemplate.queryForObject(query,rowMapper,id);
        return student;
    }

    @Override
    public int update(Student student) {
        String query = "Update Student set name = ? , city =? where id = ?";
        int r = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return r;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
