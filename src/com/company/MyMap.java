package com.company;

public interface MyMap<K, V> {

    V get(K key);

    int getSize();

    void put(K key, V value);

    boolean isEmpty();

    String toDisplay();
}
