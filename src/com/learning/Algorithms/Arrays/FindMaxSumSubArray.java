package com.learning.Algorithms.Arrays;

public class FindMaxSumSubArray {

    public static void main(String[] args) {
        System.out.println(findMaximumSubArray(new int[]{4,2,1,7,8,1,2,8,1,0}, 3));
    }

    public static int findMaximumSubArray(int[] myArray, int windowSize){
        int maximumSum = Integer.MIN_VALUE;
        int currentMaximumSum = 0;

        for (int i = 0; i < myArray.length ; i++) {
            currentMaximumSum += myArray[i];
            if(i >= windowSize-1){
                maximumSum = Math.max(maximumSum, currentMaximumSum);
                currentMaximumSum -= myArray[i-windowSize+1];
            }
        }

        return maximumSum;
    }
}
