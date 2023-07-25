package com.sky.dictionary;

public class Main {
    public static void main(String[] a){
        Dictionary<String,String> strDict = new StrStrDictionary();
        strDict.store("Saad","Ahmad");
        strDict.store("super","man");
        strDict.store("bat","man");
        System.out.println(strDict.get("Saad"));
    }
}
