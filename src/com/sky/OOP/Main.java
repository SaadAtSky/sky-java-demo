package com.sky.OOP;

public class Main {
    public static void main(String[] a){
        Vehicle ferrariRoma = new Ferrari("ferrariRoma",25,200,2, 1000);
        Vehicle AirBus = new Airbus("Kuwait",100,500,100,10_000);
        Vehicle Titanic = new Titanic("White Star Line",100,150,300,5_000);
        Garage backyard = new Garage();
        System.out.println("before storage: ");
        backyard.showGarage();
        backyard.storeVehicle(ferrariRoma);
        backyard.storeVehicle(ferrariRoma);
        backyard.storeVehicle(ferrariRoma);
//        backyard.storeVehicle(Titanic);
//        backyard.storeVehicle(Titanic);
//        backyard.storeVehicle(Titanic);
        backyard.storeVehicle(AirBus);
        backyard.storeVehicle(AirBus);
        backyard.storeVehicle(AirBus);
        System.out.println("After storage: ");
        backyard.showGarage();
        System.out.println("Total cost: " + backyard.totalCost());

    }
}
