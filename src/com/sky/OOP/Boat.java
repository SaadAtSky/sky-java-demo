package com.sky.OOP;

public class Boat extends Vehicle{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void dock(){
        System.out.println("docking");
    }
    public void sail(){
        System.out.println("sailing");
    }
}
