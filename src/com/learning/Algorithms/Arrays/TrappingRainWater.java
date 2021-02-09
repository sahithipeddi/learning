package com.learning.Algorithms.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] height){
        int left = 0;
        int right = height.length-1;
        int left_max = 0;
        int right_max =0;

        int ans = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= height[left_max]){
                    left_max = height[left] ;
                }else{
                    ans = left_max - height[left];
                    left ++;
                }
            }
            else{
                if(height[right] >= height[right_max]){
                    right_max = height[right];
                }else{
                    ans = right_max - height[right];
                    right --;
                }
            }
        }
        return ans;
    }

}

