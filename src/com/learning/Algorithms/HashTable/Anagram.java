package com.learning.Algorithms.HashTable;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(findTwoStringsAreAnagram("anagram", "anagram"));
    }

    private static boolean findTwoStringsAreAnagram(String anagram, String anagram1) {
        if(anagram.length() != anagram1.length()) return false;

        int[] table = new int[26];

        for(int i=0; i< anagram.length(); i++){

            table[anagram.charAt(i) -'a']++;
        }
        for (int i = 0; i < anagram.length() ; i++) {
            table[anagram.charAt(i) -'a']++;
            if(table[anagram1.charAt(i) -'a'] <0){
                return false;
            }
        }
        return true;
    }


}


