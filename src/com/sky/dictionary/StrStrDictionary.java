package com.sky.dictionary;

import java.util.*;

public class StrStrDictionary implements Dictionary<String,String>{
    private List<String> keys = new ArrayList<String>();
    private List<String> values = new ArrayList<String>();

    @Override
    public String get(String key) {
        return values.get(keys.indexOf(key));
    }

    @Override
    public void store(String key, String value) {
        keys.add(key);
        values.add(value);
    }

    public void getKeys(){
        for(String k : keys){
            System.out.println(k);
        }
    }
    public void getValues(){
        for(String v : values){
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
