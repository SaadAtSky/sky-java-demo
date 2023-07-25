package com.sky.creatingClasses;

public abstract class Animal {
    private int weight;
    private int height;
    private int age;
    private double satiety;
    private WorldLocation location;

    public void setLocation(WorldLocation location) {
        this.location = location;
    }
    public void getLocation(){
        this.location.showContinent();
    }

    public Animal(int weight, int height, int age, double satiety) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.satiety = satiety;
    }

    public Animal(int height, int age, int satiety){
        this(height,age,satiety,70);
    }
//    public Animal(int height, int age){
//        this(height,age,40);
//    }
//    public Animal(int height){
//        this(height,10,40);
//    }
//    public Animal(){
//        this(10,10,40);
//    }
public Animal(int height, int age){
    this(height,age,40);
}
    public Animal(int height){
        this(height,10);
    }
    public Animal(){
        this(10);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void grow(){
        height += 5;
        age += 1;
    }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }

    @Override
    public String toString() {
        return "Animal [age = "+this.getAge()+", height = "+this.getHeight()+", weight = "+this.getWeight()+", satiety = "+this.getSatiety()+"]";
    }


//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (weight != animal.weight) return false;
        if (height != animal.height) return false;
        if (age != animal.age) return false;
        return Double.compare(animal.satiety, satiety) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = weight;
        result = 31 * result + height;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(satiety);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void eat(){
        satiety += 50;
        if(satiety > 100){
            satiety = 100;
        }
    }
}
