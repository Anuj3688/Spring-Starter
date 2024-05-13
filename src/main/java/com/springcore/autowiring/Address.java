package com.springcore.autowiring;

public class Address {
    private int pincode;
    private String city;

    public Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }
    public Address(){

    }
    @Override
    public String toString() {
        return "Address{" +
                "pincode=" + pincode +
                ", city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
