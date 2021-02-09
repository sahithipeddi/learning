package com.learning.DataStructures.Arrays;

public class SmallestSubArraySum {
    public static void main(String[] args) {
        System.out.println(smallestSubArraySum(new int[]{4,2,2,7,8,1,2,8,10}, 8));
    }

    public static int smallestSubArraySum(int[] myArray, int sumValue){
        int smallestSum = Integer.MAX_VALUE;
        int currentSum = 0;
        int startIndex = 0;
        for(int endIndex=0; endIndex< myArray.length; endIndex++){
            currentSum += myArray[endIndex];
            if(currentSum >= sumValue){
                smallestSum = Math.min(smallestSum, endIndex - startIndex);
                currentSum -= myArray[endIndex-startIndex];
                startIndex++;
            }
        }
        return smallestSum;
    }
}
