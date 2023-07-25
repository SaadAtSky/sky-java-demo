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
}
