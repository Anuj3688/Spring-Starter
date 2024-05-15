package com.springcore.xmlDead;


import org.springframework.stereotype.Component;

//@Component will use only when we are using ComponentScan in JavaConfig
public class DataHub {
    private int dat1;
    private String datmeta;

    public void print(){
        System.out.println("Jai Jai Shree Ram");
    }
}
