package com.sky.dictionary;

public interface Dictionary <K,V>{
    public V get(K key);
    public void store(K key,V value);
}
