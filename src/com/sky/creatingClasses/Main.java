package com.sky.creatingClasses;

public class Main {
    public static void main(String[] a){
        Animal frog = new Frog(30);
        frog.setLocation(new WorldLocation(20,5));
        frog.getLocation();
    }
}
