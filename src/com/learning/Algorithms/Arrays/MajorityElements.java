package com.learning.Algorithms.Arrays;

/*
* Majority element is the maximum number of element occured N/2 times in an array of size N
*
* [1,2,2,2] Majority = 2 which occurred 3 times in this array.
*
* Can solve this using HashMap which can contain the number of items in this array or we can use BOYER-MOORE VOTING ALGO
*
* In Boyer Moore -> we get candidate as a result which is
*
* */

public class MajorityElements {
    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{6,5,5}));
    }

    private static int findMajorityElement(int[] nums) {


        int count = 1;
        Integer candidate = nums[0];



        for(int i =1 ;  i< nums.length; i++ ){
            if(count == 0) {
                candidate = nums[i];
            }

            count += (candidate ==  nums[i]) ? 1 : -1;
        }

        return candidate;
    }


}
