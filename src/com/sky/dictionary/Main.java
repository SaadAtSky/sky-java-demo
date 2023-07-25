package com.sky.dictionary;

public class Main {
    public static void main(String[] a){
        // String and String Dictionary
        IDictionary<String,String> strDict = new Dictionary();
        strDict.store("Saad","Ahmad");
        strDict.store("super","man");
        strDict.store("bat","man");
        strDict.store("andrew","host");
        System.out.println(strDict);

        // Integer and Double Dictionary
        IDictionary<Integer,Double> intDoubleDict = new Dictionary<>();
        intDoubleDict.store(0,1.1);
        intDoubleDict.store(1,2.1);
        intDoubleDict.store(2,3.1);
        System.out.println(intDoubleDict);

    }
}
