package com.sky.dictionary;

import java.util.*;

public class Dictionary<K,V> implements IDictionary<K,V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();

    @Override
    public V get(K key) {
        // validate key exists
        return values.get(keys.indexOf(key));
    }

    @Override
    public void store(K key, V value) {
        keys.add(key);
        values.add(value);
    }

    public void getKeys(){
        for(K k : keys){
            System.out.println(k);
        }
    }
    public void getValues(){
        for(V v : values){
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
