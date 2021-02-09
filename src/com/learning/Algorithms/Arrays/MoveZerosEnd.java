package com.learning.Algorithms.Arrays;

public class MoveZerosEnd {

    public static void main(String[] args) {
//        System.out.println(moveZerosEnd(new int[]{0, 1, 0, 3, 0, 12}));
        System.out.println(moveZerosEnd(new int[]{1, 3, 0, 12}));



    }

    private static int[] moveZerosEnd(int[] ints) {

        if(ints == null || ints.length == 0){
            return ints;
        }

        int cur = 0;

        for (int i = 0; i < ints.length; i++) {
            if(ints[i] != 0){
                int temp = ints[cur];

                ints[cur++] = ints[i];
                ints[i] = temp;
            }
        }

        return ints;
    }
}
