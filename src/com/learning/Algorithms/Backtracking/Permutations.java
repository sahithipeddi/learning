package com.learning.Algorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        System.out.println(findPermutations(new int[]{1, 2, 3}));
    }

    private static List<List<Integer>> findPermutations(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();

        backtracking(answer, new ArrayList<>(), nums);

        return answer;
    }

    private static void backtracking(List<List<Integer>> answer, List<Integer> tempList, int[] nums) {

        if(tempList.size() == nums.length){
            answer.add(new ArrayList<>(tempList));
        }

        for (int i = 0; i < nums.length; i++) {

            if(tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            backtracking(answer, tempList, nums);

            tempList.remove(tempList.size() -1 );
        }
        
    }


}
