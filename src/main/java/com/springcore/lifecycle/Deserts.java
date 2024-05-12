package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Deserts {
    private String name;
    private double cost;

    @Override
    public String toString() {
        return "Deserts{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Deserts(){
        System.out.println("Default Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @PostConstruct
    public void start(){
        System.out.println("Staring the Deserts---");
    }

    @PreDestroy
    public void end(){
        System.out.println("Done with Deserts----");
    }
}
