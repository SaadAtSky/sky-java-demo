package com.sky.creatingClasses;

public class Amphibians extends Animal{
    private double waterToLandRatio;
    public Amphibians(double waterToLandRatio){
        this.waterToLandRatio = waterToLandRatio;
    }
    public double getWaterToLandRatio() {
        return waterToLandRatio;
    }

    public void setWaterToLandRatio(double waterToLandRatio) {
        this.waterToLandRatio = waterToLandRatio;
    }

    public void swim(){

    }
}
