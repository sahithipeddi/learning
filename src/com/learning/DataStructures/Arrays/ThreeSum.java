package com.learning.DataStructures.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> outputList = new LinkedList<>();

//        Iterate through Array
        for(int i = 0; i< nums.length-2; i++){
//            Find if there is a duplicate in previous element if yes skip
            if(i==0 || (i>0 && nums[i]!= nums[i-1])){


                int low = i+1;
                int high = nums.length -1;
                int sum = 0- nums[i];
                while(low<high){
//                    found sum integers, dont stop proceeed with other integers
                    if(nums[low] + nums[high] == sum){
                        outputList.add(Arrays.asList(nums[i], nums[low], nums[high]));
//                    If next low element or next high element is equal , proceeed with next integer
                        while(low<high && nums[low] == nums[low+1]) low ++;
                        while(low<high && nums[high] == nums[high-1]) high --;
                        low ++;
                        high --;
                    }else if(nums[low] + nums[high] < sum){
                        low ++;
                    } else {
                        high --;
                    }
                }
            }
        }
        return outputList;
    }
}

class solution1 {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> outputList = new LinkedList<>();
        for(int i = 0; i< nums.length -2 ; i++){

            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
               int low = nums[i];
               int high = nums.length -1;
               int sum = 0 - nums[i];

               while(low<high){

                   if(nums[low] + nums[high] == sum) {
                        outputList.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        if(low < high && nums[low] == nums[low+1]) low ++;
                        if(low < high && nums[high] == nums[high-1]) high --;

                        low ++;
                        high --;
                   } else if(nums[low] + nums[high] < sum){
                       low ++;
                   } else{
                       high --;
                   }
               }

            }

        }
        return outputList;
    }

}