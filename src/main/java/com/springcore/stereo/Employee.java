package com.springcore.stereo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

//Introducing Component and Value here
@Component
public class Employee {
    @Value("Rama")
    private String name;
    @Value("BoloJo")
    private String datapoints;
    @Value("#{mojodo}")
    private List<String> mojoba;

    public List<String> getMojoba() {
        return mojoba;
    }

    public void setMojoba(List<String> mojoba) {
        this.mojoba = mojoba;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", datapoints='" + datapoints + '\'' +
                ", mojoba=" + mojoba +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(String datapoints) {
        this.datapoints = datapoints;
    }
}
