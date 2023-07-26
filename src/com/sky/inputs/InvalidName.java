package com.sky.inputs;

public class InvalidName extends Exception{
    public InvalidName(){
        super("Please enter a valid name");
    }
}
