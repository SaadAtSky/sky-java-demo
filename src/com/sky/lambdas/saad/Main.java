package com.sky.lambdas.saad;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            list.add(i * new Random().nextInt(100));
        }
        System.out.println("-------------Entire List---------------");
        list.forEach(num -> System.out.println(num)); // print every number
        System.out.println("--------Divisible by 3 only -------------");
        list.forEach(num -> {if(num % 3 == 0)System.out.println(num);});// print only divisble  by 3

        System.out.println("--------Calculate -------------");
        System.out.println(Calculator.calculate(20,10,(a,b) -> {return a*b;}));
    }
}
