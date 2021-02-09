package com.learning.Algorithms.Arrays;

import java.util.HashMap;
import java.util.Map;

public class RepeativtiveCharacters {

    public static void main(String[] args) {
        System.out.println(findRepeativtiveCharacters("abbbcddddeffabbbbbb"));
    }


    private static Map<Character, Integer> findRepeativtiveCharacters(String str) {
        Map<Character, Integer> result = new HashMap<Character, Integer>();

        if (str == null || str.length() <= 1) {
            return result;
        }

        for (int i = 0; i < str.length(); i++) {
            Character myChar = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                while (j < str.length() && myChar == str.charAt(j)) {
                    Integer charCount = result.get(myChar);
                    if (charCount == null) {
                        result.put(myChar, 1);
                    } else{
                        result.put(myChar, result.get(myChar)+1);
                    }
                    j++;
                    i++;
                }

                break;
            }
        }
        return result;
    }
}
