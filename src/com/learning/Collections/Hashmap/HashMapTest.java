package com.learning.Collections.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap();

        map.put(5,"Five");
        map.put(10,"Ten");
        map.put(1,"One");
        map.put(4,"Four");
        map.put(7,"Seven");
        map.put(9,"Nine");

        map.put(4,"Hello");

        String text = map.get(4);

        System.out.println(text);

        for(Map.Entry<Integer,String> entry: map.entrySet()){

            int key = entry.getKey();

            String value = entry.getValue();

            System.out.println(key + " : " + value);

        }

    }
}
