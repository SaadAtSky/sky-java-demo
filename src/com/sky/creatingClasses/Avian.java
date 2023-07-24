package com.sky.creatingClasses;

public class Avian extends Animal{
    private double wingspan;

    public Avian(double wingspan){
        this.wingspan = wingspan;
    }
    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void fly(){

    }
}
