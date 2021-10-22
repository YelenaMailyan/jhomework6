package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MyMap<Integer, String> myHashMap = new MyHashMap<>();
        System.out.println("Size- " + myHashMap.getSize());
        System.out.println("Is HashMap empty?- Answer is " + myHashMap.isEmpty());
        myHashMap.put(34, "A1");
        myHashMap.put(35, "A2");
        myHashMap.put(35, "A3");
        myHashMap.put(36, "A4");
        myHashMap.put(336, "A5");
        myHashMap.put(337, "A6");
        myHashMap.put(337, "");
        myHashMap.put(340, "A6");
        myHashMap.put(null, "A9"); //  Lets check is the return value true as 36 and 340 has same index ;
        System.out.println("Get by key " + myHashMap.get(36));
        System.out.println("Get by key " + myHashMap.get(340));
        System.out.println("Size- " + myHashMap.getSize());
        System.out.println("Is HashMap empty?- Answer is " + myHashMap.isEmpty());
        System.out.println(myHashMap.toDisplay());



        // for compare same for HashMap
        System.out.println("--------HASHMAP-------");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(34, "A1");
        hashMap.put(35, "A2");
        hashMap.put(35, "A3");
        hashMap.put(36, "A4");
        hashMap.put(336, "A5");
        hashMap.put(337, "");
        hashMap.put(340, "A6");
        hashMap.put(null, "A9");
        System.out.println(hashMap);

    }
}
