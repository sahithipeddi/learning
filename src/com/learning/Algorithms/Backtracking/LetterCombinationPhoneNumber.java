package com.learning.Algorithms.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {


    public static void main(String[] args) {
        String digits = "23";
        System.out.println(findLetterCombinationPhoneNumber(digits));


    }

    private static List<String> findLetterCombinationPhoneNumber(String digits) {

        List<String> answer = new ArrayList<>();
        if (digits.length() != 0) {
            backtrack(answer, "", digits);
        }
        return answer;
    }

    private static void backtrack(List<String> answer, String s, String digits) {

        Map<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("2", "abc");
        myHashMap.put("3", "def");
        myHashMap.put("4", "ghi");
        myHashMap.put("5", "jkl");
        myHashMap.put("6", "mno");
        myHashMap.put("7", "pqrs");
        myHashMap.put("8", "tuv");
        myHashMap.put("9", "wxyz");

        if (digits.length() == 0) {
            answer.add(s);
        } else {
            String digit = digits.substring(0, 1);
            for (int i = 0; i < digits.length(); i++) {
                String letters = myHashMap.get(digit).substring(i, i + 1);
                backtrack(answer, s + letters, digits.substring(1));
            }
        }
    }

}
