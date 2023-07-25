package com.sky.creatingClasses;

public class Frog extends Amphibians implements Tame{
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
    public void feed(){
        System.out.println("getting fed");
    }
    public void pet(){
        System.out.println("becoming a pet");
    }
}
