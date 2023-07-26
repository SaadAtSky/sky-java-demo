package com.sky.lambdas.saad;

public class Calculator{
    public static double calculate(int a, int b,FuncInterface func){// 10,10,a*b
        return func.operation(a,b);
    }
}
