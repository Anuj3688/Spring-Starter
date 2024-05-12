package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drinks implements InitializingBean, DisposableBean {
    private double cost;
    private String name;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("INIT Method Called for Drinks");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Distruction taking place for Drinks");
    }
}
