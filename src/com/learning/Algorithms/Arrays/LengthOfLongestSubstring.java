package com.learning.Algorithms.Arrays;

/*Given a string, find the length of the longest substring without repeating characters.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
//        String myString = "abcabcbb";
//        String myString = "bbbbb";
//          String myString = "pwwkew";
        String myString = "aab";
        System.out.println(lengthOfLongestSubstring(myString));
    }

    private static int lengthOfLongestSubstring(String myString) {
        int lengthOfLongestSubstring = 0;
        int startWindow = 0;
        HashSet<Character> myHashSet = new HashSet<>();

        for(int endWindow=0; endWindow < myString.length(); endWindow++){
            Character rightCharacter = myString.charAt(endWindow);
            if(myHashSet.contains(rightCharacter)) {
                myHashSet.remove(myString.charAt(startWindow));
                startWindow ++;
            }else if(!myHashSet.contains(rightCharacter)){
                myHashSet.add(rightCharacter);
                lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, myHashSet.size());
            }
        }
        return lengthOfLongestSubstring;
    }
}
