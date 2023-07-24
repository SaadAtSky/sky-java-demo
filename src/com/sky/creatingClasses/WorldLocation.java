package com.sky.creatingClasses;

public class WorldLocation {
    private double x;
    private double y;
    public WorldLocation(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void showContinent(){
        if(x > 0 && x <= 10){
            if(y > 1 && y < 10){
                System.out.println("You are in America");
            }
        }
        if(x > 10 && x <= 20){
            if(y > 1 && y < 10){
                System.out.println("You are in Asia");
            }
        }
        if(x > 20 && x <= 30){
            if(y > 1 && y < 10){
                System.out.println("You are in Australia");
            }
        }
        if(x > 30 && x <= 40){
            if(y > 1 && y < 10){
                System.out.println("You are in Europe");
            }
        }
    }
}