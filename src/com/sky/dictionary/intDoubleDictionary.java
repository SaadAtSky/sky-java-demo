package com.sky.dictionary;

import java.util.ArrayList;
import java.util.List;

public class intDoubleDictionary implements Dictionary<Integer,Double> {
    private List<Integer> keys = new ArrayList<Integer>();
    private List<Double> values = new ArrayList<Double>();

    @Override
    public Double get(Integer key) {
        return values.get(keys.indexOf(key));
    }

    @Override
    public void store(Integer key, Double value) {
        keys.add(key);
        values.add(value);
    }

    public void getKeys(){
        for(int k : keys){
            System.out.println(k);
        }
    }
    public void getValues(){
        for(double v : values){
            System.out.println(v);
        }
    }
    @Override
    public String toString() {
        String returnString = "";
        for(int i = 0; i < keys.size();i++){
            returnString += "{"+keys.get(i)+", "+values.get(i)+"}\n";
        }
        return returnString;
    }
}
