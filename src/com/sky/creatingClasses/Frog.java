package com.sky.creatingClasses;

public class Frog extends Amphibians{
    private double jumpDistance;
    public Frog(double waterToLandRatio){
        super(waterToLandRatio);
    }
    public double getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(double jumpDistance) {
        this.jumpDistance = jumpDistance;
    }
}
