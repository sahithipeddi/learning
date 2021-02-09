package com.learning.Algorithms.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringDistinctCharacters {
    public static void main(String[] args) {
        String myString = "AAAHHIBC";
        int maxCharacters = 3;
        System.out.println(findLongestSubStringKDistinctCharacters(myString, maxCharacters));
    }

    public static int findLongestSubStringKDistinctCharacters(String myString, int maxCharacters){
        int longestSubString = 0;
        int startWindow = 0;
        Map<Character, Integer> sequneceCount = new HashMap<>();
        for (int endWindow =0; endWindow<myString.length(); endWindow++){
            Character rightCharacter = myString.charAt(endWindow);
            sequneceCount.put(rightCharacter, sequneceCount.getOrDefault(rightCharacter,0)+1);
            while (sequneceCount.size() >= maxCharacters){
                Character leftChar = myString.charAt(startWindow);
                sequneceCount.put(leftChar, sequneceCount.get(leftChar)-1);
                if(sequneceCount.get(leftChar) == 0){
                    sequneceCount.remove(leftChar);
                }
                startWindow++;
            }
            longestSubString = Math.max(longestSubString, (endWindow - startWindow)+1);
        }
        return longestSubString;
    }
}
