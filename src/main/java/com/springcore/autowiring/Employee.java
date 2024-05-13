package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class Employee {
    private String name;
    private List<String> datapoints;

    // Here Autowired is used to that it can fetch automatically
    // Also Qualifier is used to tell the name
    @Autowired
    @Qualifier("Address2")
    private Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", datapoints=" + datapoints +
                ", address=" + address +
                '}';
    }

    public List<String> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<String> datapoints) {
        this.datapoints = datapoints;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
