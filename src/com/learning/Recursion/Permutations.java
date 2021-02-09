package com.learning.Recursion;

public class Permutations {

    public static void main(String[] args) {
        
        permutation("abc");
    }

    private static void permutation(String word) {

        permutate("", word);
    }

    private static void permutate(String perm, String word) {

        if(word.isEmpty()){
            System.out.println(perm + word);
        } else {
            for (int i = 0; i < word.length() ; i++) {
                permutate(perm + word.charAt(i), word.substring(0, i) + word.substring(i+1, word.length()));
            }
        }

    }

}
