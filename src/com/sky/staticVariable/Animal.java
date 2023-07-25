package com.sky.staticVariable;

public class Animal {
    private static int year;
    private int age;
    private int birthYear;
    private String breed;

    public Animal(String breed,int birthYear){
        this.breed = breed;
        this.birthYear = birthYear;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Animal.year = year;
    }

    public int getAge(){
        return year - birthYear;
    }
}
