package com.sky.enums;

public enum Job {
    softwareDev(38_000), DevOpsEngineer(35_000), SREngineer(35_000), Janitor(22_000);
    private double salary;
    private double hoursPerWeek = 37.50;
    private Job(double salary){
        this.salary = salary;
    }
    public double calcHourlyPay(){
        return salary/hoursPerWeek;
    }
    public void raise(){
        this.salary *= 0.01;
    }

}
