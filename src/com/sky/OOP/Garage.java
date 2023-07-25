package com.sky.OOP;

import java.util.Arrays;

public class Garage {
    Vehicle[] vehicles;

    public Garage() {
        vehicles = new Vehicle[6];
    }

    public int storeVehicle(Vehicle v){
        // first/second slot for car
        // third/4th for ship
        // 5th/5th for plane
        if(v instanceof Car){
            for(Vehicle veh : vehicles){
                if(veh == v){
                    return -1;
                }
            }
            for(int i = 0;i<2;i++){
                if(vehicles[i] == null){
                    vehicles[i] = (Car)v;
                    return i;
                }
            }
        }
        if(v instanceof Boat){
            for(Vehicle veh : vehicles){
                if(veh == v){
                    return -1;
                }
            }
            for(int i = 2;i<4;i++){
                if(vehicles[i] == null){
                    vehicles[i] = (Boat)v;
                    return i;
                }
            }
        }
        if(v instanceof AirPlane){
            for(Vehicle veh : vehicles){
                if(veh == v){
                    return -1;
                }
            }
            for(int i = 4;i<6;i++){
                if(vehicles[i] == null){
                    vehicles[i] = (AirPlane)v;
                    return i;
                }
            }
        }
        return -1;
    }
    public void showGarage(){
        for(int i = 0;i < vehicles.length;i++){
            if(vehicles[i] == null){
                System.out.println("null");
            }
            else{
                System.out.println(vehicles[i]);
            }
        }
    }
    public int totalCost(){
        int cost = 0;
        for(Vehicle v : vehicles){
            if(v != null){
                cost += v.getCost();
            }
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "vehicles=" + Arrays.toString(vehicles) +
                '}';
    }
}
