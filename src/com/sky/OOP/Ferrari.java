package com.sky.OOP;

public class Ferrari extends Car{
    boolean sunRoofOpen;
    public Ferrari(String brand, int mileage, int topSpeed, int passengerCapacity,int cost){
        setBrand(brand);
        setMileage(mileage);
        setTopSpeed(topSpeed);
        setPassengerCapacity(passengerCapacity);
        setCost(cost);
    }
    public void toggleSunRoof(){
        this.sunRoofOpen = sunRoofOpen ? false : true;
    }
}
