package com.sky.dictionary;

public interface IDictionary<K,V>{
    public V get(K key);
    public void store(K key,V value);
}
