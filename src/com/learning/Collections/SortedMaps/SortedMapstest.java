package com.learning.Collections.SortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapstest {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap <Integer, String>();

        /*Linked Hashmap is same as Hashmap except that it has a linked list connecting
        *
        * Hash -? If you have a class which doesn't have toString. when you sout a object, the value after @ sign is a hashcode.
        *
        * Tree Map - A tree is basic structures in computing, it sorts the values you add in natural order.
        *
        * For Int - 1,2,3,.. String - Albhabetical, You can create your own natural order.
        *
        * Collection classes are organized on various interfaces. 3 main are List, Map, Set interfaces
        *
        * Hashmap -
        *
        *
        * LinkedHashmap - Maintains the order of things that we have put things in
        *
        * TreeMap - Sort the keys in natural order
        *
        *
        * */

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap <Integer, String>();

        TreeMap<Integer, String> treeMap = new TreeMap <Integer, String>();


        System.out.println(new SortedMapstest());

        testMap(hashMap);

    }

    public static void  testMap(Map<Integer, String> map){

        map.put(5,"Five");
        map.put(10,"Ten");
        map.put(1,"One");
        map.put(4,"Four");
        map.put(7,"Seven");
        map.put(9,"Nine");

        map.put(4,"Hello");

        for(Integer key:map.keySet()){

            String value = map.get(key);

            System.out.println(key + " : " +value);

        }

    }
}
