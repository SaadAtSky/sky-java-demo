package com.sky.OOP;

import java.util.Arrays;

public class Garage {
    Vehicle[] vehicles;
//    private int emptySlots;

    public Garage(){
//        emptySlots = 4;
        vehicles = new Vehicle[6];
    }

//    public void setEmptySlots(int emptySlots) {
//        this.emptySlots = emptySlots;
//        vehicles = new Vehicle[6];
//    }

    public int storeVehicle(Vehicle v){
        // first/second slot for car
        // third/4th for ship
        // 5th/5th for plane
        if(v instanceof Car){
            for(int i = 0;i<2;i++){
                if(vehicles[i] == null){
                    vehicles[i] = (Car)v;
                    return i;
                }
            }
        }
        if(v instanceof Boat){
            for(int i = 2;i<4;i++){
                if(vehicles[i] == null){
                    vehicles[i] = (Boat)v;
                    return i;
                }
            }
        }
        if(v instanceof AirPlane){
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
//        for(Vehicle v : vehicles){
//            System.out.println(v);
//        }
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

//    public int storeVehicle(Vehicle v){
//        System.out.println("storing " + v.getClass());
//        if(v instanceof Car){
//            if(getSlot4() == null){
//                slot4 = (Car)v;
//                emptySlots--;
//            }
//            else{
//                System.out.println("Car space full");
//            }
//        }
//        else if(getSlot1() == null){
//            emptySlots--;
//            if(v instanceof Boat){
//                setSlot1((Boat)v);
//            }
//            else setSlot1((AirPlane)v);
//        }
//        else if(getSlot2() == null){
//            emptySlots--;
//            if(v instanceof Boat){
//                setSlot2((Boat)v);
//            }
//            else setSlot2((AirPlane)v);
//        }
//        else if(getSlot3() == null){
//            emptySlots--;
//            if(v instanceof Boat){
//                setSlot3((Boat)v);
//            }
//            else setSlot3((AirPlane)v);
//        }
//        else{
//            System.out.println("no space for boat/airplane");
//        }
//        return emptySlots;
//    }

//    public int getTotalCost(){
//        if(getSlot1() != null){
//            cost += getSlot1().getCost();
//        }
//        if(getSlot2() != null){
//            cost += getSlot2().getCost();
//        }
//        if(getSlot3() != null){
//            cost += getSlot3().getCost();
//        }
//        if(getSlot4() != null){
//            cost += getSlot4().getCost();
//        }
//        return cost;
//    }


    @Override
    public String toString() {
        return "Garage{" +
                "vehicles=" + Arrays.toString(vehicles) +
                '}';
    }
}
