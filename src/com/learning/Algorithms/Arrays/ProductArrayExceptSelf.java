package com.learning.Algorithms.Arrays;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        int[] productArrayExceptSelf = findProductArrayExceptSelf(new int[]{2, 3, -2, 4});

        for (int i:
             productArrayExceptSelf) {
            System.out.println("Product array is: "+i);
        }

    }

    private static int[] findProductArrayExceptSelf(int[] ints) {
        int l[] = new int[ints.length];
        int r[] = new int[ints.length];
        int result[] = new int[ints.length];

        l[0] = 1; r[ints.length-1] = 1;

        for(int i = 1; i< ints.length; i++){
            l[i] = l[i-1]*ints[i-1];
        }
        for(int i = ints.length -2; i >= 0; i--){
            r[i] = r[i + 1]*ints[i + 1];
        }

        for(int i = 0; i< ints.length; i++){
            result[i] = l[i]*r[i];
        }

        return result;
    }


}
