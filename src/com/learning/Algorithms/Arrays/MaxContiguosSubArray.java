package com.learning.Algorithms.Arrays;

public class MaxContiguosSubArray {
    public static void main(String[] args) {
        System.out.println(findMaxContiguosSubArray(new int[]{-163, -20}));
    }

    private static int findMaxContiguosSubArray(int[] A) {

        int currentSum = 0;

        int maxSum = Integer.MIN_VALUE;

        if(A.length == 1){
            return A[0];
        }

        for(int i = 0; i< A.length; i++){
            currentSum = Math.max(A[i], currentSum+A[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
