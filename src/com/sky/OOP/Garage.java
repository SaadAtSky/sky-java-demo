package com.sky.OOP;

public class Garage {
    private Vehicle slot1;
    private Vehicle slot2;
    private Vehicle slot3;
    private Car slot4;
    private int emptySlots;
    private int cost;

    public Garage(){
        emptySlots = 4;
        cost = 0;
    }

    public Vehicle getSlot1() {
        return slot1;
    }

    public void setSlot1(Vehicle slot1) {
        this.slot1 = slot1;
    }

    public Vehicle getSlot2() {
        return slot2;
    }

    public void setSlot2(Vehicle slot2) {
        this.slot2 = slot2;
    }

    public Vehicle getSlot3() {
        return slot3;
    }

    public void setSlot3(Vehicle slot3) {
        this.slot3 = slot3;
    }

    public Car getSlot4() {
        return slot4;
    }

    public void setSlot4(Car slot4) {
        this.slot4 = slot4;
    }

    public int getEmptySlots() {
        return emptySlots;
    }

    public void setEmptySlots(int emptySlots) {
        this.emptySlots = emptySlots;
    }
    public int storeVehicle(Vehicle v){
        System.out.println("storing " + v.getClass());
        if(v instanceof Car){
            if(getSlot4() == null){
                slot4 = (Car)v;
                emptySlots--;
            }
            else{
                System.out.println("Car space full");
            }
        }
        else if(getSlot1() == null){
            emptySlots--;
            if(v instanceof Boat){
                setSlot1((Boat)v);
            }
            else setSlot1((AirPlane)v);
        }
        else if(getSlot2() == null){
            emptySlots--;
            if(v instanceof Boat){
                setSlot2((Boat)v);
            }
            else setSlot2((AirPlane)v);
        }
        else if(getSlot3() == null){
            emptySlots--;
            if(v instanceof Boat){
                setSlot3((Boat)v);
            }
            else setSlot3((AirPlane)v);
        }
        else{
            System.out.println("no space for boat/airplane");
        }
        return emptySlots;
    }

    public int getTotalCost(){
        if(getSlot1() != null){
            cost += getSlot1().getCost();
        }
        if(getSlot2() != null){
            cost += getSlot2().getCost();
        }
        if(getSlot3() != null){
            cost += getSlot3().getCost();
        }
        if(getSlot4() != null){
            cost += getSlot4().getCost();
        }
        return cost;
    }

    @Override
    public String toString() {
        return ""+getClass()+"[slot1 = "+getSlot1()+", slot2 = "+getSlot2()+", slot3 = "+getSlot3()+", slot4 = "+getSlot4()+", total empty slots = "+getEmptySlots()+"]";
    }
}
