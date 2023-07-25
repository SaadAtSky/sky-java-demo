package com.sky.OOP;

public class Ferrari extends Car{
    boolean sunRoofOpen;
    public Ferrari(String brand, int mileage, int topSpeed, int passengerCapacity){
        setBrand(brand);
        setMileage(mileage);
        setTopSpeed(topSpeed);
        setPassengerCapacity(passengerCapacity);
    }
    public void toggleSunRoof(){
        this.sunRoofOpen = sunRoofOpen ? false : true;
    }
}
