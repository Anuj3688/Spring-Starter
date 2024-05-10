package org.spring;

import java.util.Map;
import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private List<Integer> studentMarks;
    private Map<String,Integer> studentConfig;
    private Address studentPAddress;

    public Address getStudentPAddress() {
        return studentPAddress;
    }

    public void setStudentPAddress(Address studentPAddress) {
        this.studentPAddress = studentPAddress;
    }

    public Map<String, Integer> getStudentConfig() {
        return studentConfig;
    }

    public void setStudentConfig(Map<String, Integer> studentConfig) {
        this.studentConfig = studentConfig;
    }

    public List<Integer> getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(List<Integer> studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentMarks=" + studentMarks +
                ", studentConfig=" + studentConfig +
                ", studentPAddress="+studentPAddress+
                '}';
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
