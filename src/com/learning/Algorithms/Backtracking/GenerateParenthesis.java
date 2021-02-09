package com.learning.Algorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)
public class GenerateParenthesis {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }

    private static List<String> generateParenthesis(int parantesisCount) {

        List<String> answer = new ArrayList<>();
        int openParathesisCount = 0;
        int closedParathesisCount = 0;

        backtrack(answer, "", openParathesisCount, closedParathesisCount, parantesisCount);

        return answer;
    }

    private static void backtrack(List<String> answer, String currentString, int openParathesisCount, int closedParathesisCount, int parantesisCount) {
        if(currentString.length() == parantesisCount*2){
            answer.add(currentString);
            return;
        }

        if(openParathesisCount < parantesisCount){
            backtrack(answer, currentString+"(", openParathesisCount+1, closedParathesisCount, parantesisCount);
        }

        if(openParathesisCount > closedParathesisCount) {
            backtrack(answer, currentString+")", openParathesisCount, closedParathesisCount+1, parantesisCount);
        }
    }

}
