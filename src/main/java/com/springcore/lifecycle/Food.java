package com.springcore.lifecycle;

public class Food {
    private String name;
    private int cost;

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
public void init(){
    System.out.println("Calling the Initialization Method");
}
public void destroy(){
    System.out.println("Calling the destruction Method");
}
public Food(){
    System.out.println("Default Constructor Called");
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
