package com.sky.staticVariable;

public class Main {
    public static void main(String[] a){
        Animal lion = new Animal("lion",1900);
        Animal zebra = new Animal("zebra",1950);
        Animal.setYear(2023);
        System.out.println(lion.getAge());
        System.out.println(zebra.getAge());
        System.out.println("Total Age: " + Calculator.add(lion.getAge(),zebra.getAge()));
    }
}
