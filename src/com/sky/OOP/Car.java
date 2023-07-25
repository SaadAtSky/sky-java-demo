package com.sky.OOP;

public abstract class Car extends Vehicle {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void drive(){
        System.out.println("driving");
    }
    public void brake(){
        System.out.println("braking");
    }
}
