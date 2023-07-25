package com.sky.OOP;

public class AirPlane extends Vehicle{
    private String airlines;
    public void land(){
        System.out.println("landing");
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public void takeoff(){
        System.out.println("taking off.. please fasten your seatbelts");
    }
}
