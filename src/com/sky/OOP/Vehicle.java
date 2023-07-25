package com.sky.OOP;

public abstract class Vehicle {
    private int mileage;
    private int speed;
    private int passengerCapacity;
    private String brand;
    private String direction;

    public void drive(){
        System.out.println("Drive");
    }
    public void halt(){
        System.out.println("halting");
    }
    public void turn(String turnDirection){
        System.out.println("turning");
        direction = turnDirection;
        }
    }

}
