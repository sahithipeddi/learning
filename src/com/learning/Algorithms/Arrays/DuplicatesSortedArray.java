package com.learning.Algorithms.Arrays;


public class DuplicatesSortedArray {


    public static int removeDuplicates(int[] nums) {

/*        int count = 0;

        int currentNum = nums[0];

            for (int j = 1; j < nums.length; j++) {

                if(nums[j] != currentNum){
                    System.out.println("Incrementing Counter");
                    count ++;
                    currentNum = nums[j];
                }

            }


        return count+1;*/

       int i = 0;

       for (int j = 1; j<nums.length; j++){

           if(nums[i]!=nums[j]){
               i++;
               nums[j] = nums[i];

           }

       }

       return i+1;
    }


    public static void main(String[] args) {

        int[] myArray = {0,0,1,1,1,2,2,3,3,4};

        int[] myArray2 = {1,1,2};

        System.out.println(removeDuplicates(myArray2));

    }

}
