package com.learning.DataStructures.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int totalSum = 6;
//        int[] ints = twoSum(new int[]{2, 7, 11, 15}, totalSum);
        int[] ints = twoSum(new int[]{3,2,4}, totalSum);
        for (int i:
             ints) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] ints, int totalSum) {

        Map<Integer, Integer> myHashMap = new HashMap<>();
        for (int i=0; i< ints.length; i++) {
            myHashMap.put(ints[i], i);
        }

        for (int i=0; i< ints.length; i++){
            int complement = totalSum - ints[i];
            if(myHashMap.containsKey(complement)){
                return new int[]{i, myHashMap.get(complement)};
            }
        }

        return null;
    }


}
