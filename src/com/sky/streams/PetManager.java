package com.sky.streams;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PetManager {
    private List<Pet> pets;
    public List<Pet> printAllPets(){
        Stream<Pet> petStream = pets.stream().filter(pet -> pet.getAge() > 15);
        return petStream.collect(Collectors.toList());
    }
    public long getCount(){
        return pets.stream().count();
    }
    public long totalAge(){
        return pets.stream().mapToInt(x -> x.getAge()).sum();
    }
    public List<Pet> sortByAge(){
        Stream<Pet> petStream = pets.stream().sorted((pet1,pet2) -> pet2.getAge() - pet1.getAge());
        return petStream.collect(Collectors.toList());
    }
    public List<Pet> filterByAnimal(Animal a){
        Stream<Pet> petStream = pets.stream().filter(pet -> pet.getAnimal()==a);
        return petStream.collect(Collectors.toList());
    }
    public List<Pet> sortByAgeAndName(){
        List<Pet> sortedByAge = this.sortByAge();
        Stream<Pet> petStream = sortedByAge.stream().sorted((pet1,pet2) -> pet1.getName().compareToIgnoreCase(pet2.getName()));
        return petStream.collect(Collectors.toList());
    }
    public void setPets(List<Pet> pets){
        this.pets = pets;
    }
    public HashMap<Animal,Integer> countOfEachAnimal(){
        HashMap<Animal,Integer> map = new HashMap<>();
        pets.stream().forEach(pet -> {map.put(pet.getAnimal(),map.getOrDefault(pet.getAnimal(),0)+1);});
        return map;
    }
}
