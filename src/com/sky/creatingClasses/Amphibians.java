package com.sky.creatingClasses;

public class Amphibians extends Animal{
    public double getWaterToLandRatio() {
        return waterToLandRatio;
    }

    public void setWaterToLandRatio(double waterToLandRatio) {
        this.waterToLandRatio = waterToLandRatio;
    }

    private double waterToLandRatio;

    public void swim(){

    }
}
