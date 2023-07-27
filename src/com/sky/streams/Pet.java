package com.sky.streams;

public class Pet {
    private int age;
    private String name;
    private Animal animal;

    public Pet(int age, String name, Animal animal) {
        this.age = age;
        this.name = name;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", animal=" + animal +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
