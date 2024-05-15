package com.springcore.stereo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("EP")
@Scope("prototype")
public class Employee_prototype {
    @Value("2342")
    private int id;
    @Value("jojojba")
    private String name;

    @Override
    public String toString() {
        return "Employee_prototype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
