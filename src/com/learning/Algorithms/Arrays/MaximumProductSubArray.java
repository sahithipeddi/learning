package com.learning.Algorithms.Arrays;

public class MaximumProductSubArray {

    public static void main(String[] args) {
        System.out.println(findMaximumProductSubArray(new int[]{2, 3, -2, 4}));
    }

    private static int findMaximumProductSubArray(int[] ints) {

        if (ints == null || ints.length == 0) return 0;

        int max = ints[0];
        int min = ints[0];

        int result = ints[0];

        for (int i = 1; i < ints.length; i++) {

            int temp = max;
            int submax = Math.max(max * ints[i], min * ints[i]);
            max = Math.max(submax, ints[i]);
            int submin = Math.min(temp * ints[i], min * ints[i]);
            min = Math.min(submin, ints[i]);

            if (max > result) {
                return max;
            }

        }
        return result;
    }



}
