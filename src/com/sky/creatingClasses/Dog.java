package com.sky.creatingClasses;

public class Dog extends Mammals{
    private String breed;

    public String getBreed() {
        return breed;
    }

    public Dog(String breed){
        this.breed = breed;
    }
    public void bark(){
        System.out.println("BARK!!!");
    }
}
