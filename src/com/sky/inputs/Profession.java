package com.sky.inputs;

public enum Profession {
    SoftwareDeveloper(30_000), SRE(20_000), DevOpsEngineer(25_000);
    private double salary;
    private Profession(double salary){
        this.salary = salary;
    }
}
