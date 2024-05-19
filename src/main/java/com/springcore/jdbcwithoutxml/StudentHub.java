package com.springcore.jdbcwithoutxml;

import com.springcore.jdbcwithoutxml.Student;

import java.util.List;

public interface StudentHub {
    public int insert(Student student);
    public Student getStudent(int id);
    public List<Student> getStudents();

    public int update(com.springcore.jdbcwithoutxml.Student student);
}
