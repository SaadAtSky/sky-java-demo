package com.sky.dictionary;

public class Main {
    public static void main(String[] a){
        Dictionary<String,String> strDict = new StrStrDictionary();
        strDict.store("Saad","Ahmad");
        strDict.store("super","man");
        strDict.store("bat","man");
        System.out.println("------Keys-------");
        if(strDict instanceof StrStrDictionary){
            ((StrStrDictionary) strDict).getKeys();
        }
        System.out.println("------Values-------");
        if(strDict instanceof StrStrDictionary){
            ((StrStrDictionary) strDict).getValues();
        }
    }
}
