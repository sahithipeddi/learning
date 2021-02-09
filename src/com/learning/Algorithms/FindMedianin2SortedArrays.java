package com.learning.Algorithms;

/*There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.
 */

public class FindMedianin2SortedArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length){
            findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;

        int start = 0;
        int end = x;

        while(start<= end) {
            int partitionX = (start + end) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int minLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX -1];
            int maxRightX = (partitionX == x) ? Integer.MAX_VALUE: nums1[partitionX];

            int minLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY -1];
            int maxRightY = (partitionY == y) ? Integer.MAX_VALUE: nums2[partitionY];

            if(minLeftX<= maxRightY && minLeftY <= maxRightX){
                if( (x+y) % 2 ==0 ){
                    return  Math.max(minLeftX, minLeftY) + Math.min(maxRightX,maxRightY) /2;
                }
                else
                    return Math.max(minLeftX, minLeftY);
            }

            else if(minLeftX > maxRightY){
                end = partitionX -1; //Move towards left of x
            }
            else if(minLeftY > maxRightX){
                start = partitionX + 1; //Move towards right of x
            }

        }

        throw new IllegalArgumentException();
    }
}