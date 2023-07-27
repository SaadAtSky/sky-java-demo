package com.sky.streams;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet(10,"doggy",Animal.dog));
        pets.add(new Pet(14,"kitty",Animal.cat));
        pets.add(new Pet(10,"chick",Animal.chicken));
        pets.add(new Pet(70,"labrador",Animal.dog));
        pets.add(new Pet(20,"scooby",Animal.dog));
        pets.add(new Pet(10,"German Sheppard",Animal.dog));
        PetManager manager = new PetManager();
        manager.setPets(pets);
//        manager.printAllPets().forEach(System.out::println);
//        System.out.println(manager.getCount());
//        System.out.println(manager.totalAge());
//        manager.sortByAge().forEach(System.out::println);
//        manager.filterByAnimal(Animal.dog).forEach(System.out::println);
//        manager.sortByAgeAndName().forEach(System.out::println);
        manager.countOfEachAnimal().forEach((x,y) -> System.out.println("Animal: " + x + " Count: "+ y));



        // empty hashmap
        // dog -> 4
        // cat -> 1
        // chicken -> 1
    }
}
