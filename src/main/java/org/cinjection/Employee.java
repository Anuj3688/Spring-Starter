package org.cinjection;

import org.cinjection.Address;

import java.util.List;

public class Employee {
    private int Id;
    private String Name;
    private Address Address;
    private List<Integer> leaves;

    public List<Integer> getLeaves() {
        return leaves;
    }

    public void setLeaves(List<Integer> leaves) {
        this.leaves = leaves;
    }

    public Employee(List<Integer> leaves, org.cinjection.Address address, String name, int id) {
        this.leaves = leaves;
        Address = address;
        Name = name;
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public org.cinjection.Address getAddress() {
        return Address;
    }

    public void setAddress(org.cinjection.Address address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Address=" + Address +
                '}';
    }
}
