package com.sky.creatingClasses;

public class Mammals extends Animal{
    private Animal[] animals;

    public Mammals(){

    }

    public void showAnimals() {
        for(Animal a : animals){
            System.out.println(a);
        }
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void walk(){

    }
}
