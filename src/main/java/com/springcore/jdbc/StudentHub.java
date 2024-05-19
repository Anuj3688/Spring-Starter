package com.springcore.jdbc;

import java.util.List;

public interface StudentHub {
    public int insert(Student student);
    public int update(Student student);
    public Student getStudent(int id);
    public List<Student> getStudents();
}
