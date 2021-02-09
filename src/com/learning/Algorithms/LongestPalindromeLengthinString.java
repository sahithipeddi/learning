package com.learning.Algorithms;

public class LongestPalindromeLengthinString {

    public static void main(String[] args) {
        String myString = "ababa";
        System.out.println(longestPalindromicSubStringLegth(myString));
    }

    public static int longestPalindromicSubStringLegth(String myString){
        int[] my_Char = new int[128];
        int result = 0;
        for (char Char:
             myString.toCharArray()) {
            my_Char[Char] ++;
        }

        for(int i=0; i< my_Char.length; i++){
            System.out.println(my_Char[i]);
            result += my_Char[i]/2 *2;
            if(result %2 ==0 && my_Char[i]%2 ==1){
                result += 1;
            }
        }

        return result;
    }
}
