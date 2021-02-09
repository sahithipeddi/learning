package com.learning.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class ZigZagConversion {
    public static void main(String[] args) {
        String myString = "PAYPALISHIRING";
        int numberOfRows = 3;
        System.out.println(doZigZagConversion(myString, numberOfRows));
    }

    public static String doZigZagConversion(String myString, int numberOfRows){
        int position = 0;
        Map<Integer, StringBuilder> myMap = new HashMap<>();
        boolean increment = true;
        for(Character c: myString.toCharArray()){
            if(position == numberOfRows) increment = false; // if pos reaches the end we don't increment but we decrement
            if(position == 1) increment = true;
            if(increment)
                position ++;        // if increment is true we keep adding char to next pos else we decrease pos and add char there
            else
                position --;
            if(!myMap.containsKey(position)){
                myMap.put(position, new StringBuilder()); // Create a new position in map if position is new
            }
            myMap.get(position).append(c); // add char to the position in map
        }
        StringBuilder result = new StringBuilder();
        for (int i:
             myMap.keySet()) {
            result.append(myMap.get(i));
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
