package com.sky.creatingClasses;

public class Main {
    public static void main(String[] a){
        Animal frog = new Frog(30);
        System.out.println(frog);
        if (frog instanceof Frog){
            Frog frogAsFrog = (Frog) frog;
            frogAsFrog.pet();
        }

        // method overriding
    }
}
