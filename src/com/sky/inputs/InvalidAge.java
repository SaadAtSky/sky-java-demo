package com.sky.inputs;

public class InvalidAge extends Exception{
    public InvalidAge(){
        super("Please enter a valid age");
    }
}
