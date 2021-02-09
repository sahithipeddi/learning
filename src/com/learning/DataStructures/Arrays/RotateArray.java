package com.learning.DataStructures.Arrays;

public class RotateArray {

    public static void main(String[] args) {
//        int[] myArray = {0,0,1,1,1,2,2,3,3,4};

        int[] myArray = {1,2,3,4,5,6,7};

        int[] myArray2 = {1,1,2};

        int position = 3;
        rotateArray(myArray, position);
        System.out.println();
    }

   /* private static boolean rotateArray(int[] myArray, int position) {

        int[] tempArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            tempArray[(i + position) % myArray.length] = myArray[i];

        }

        for (int i = 0; i < tempArray.length; i++) {

            myArray[i] = tempArray[i];
            System.out.println(myArray[i]);

        }

        return false;
    }*/


   private static boolean rotateArray(int[] myarray, int position){

       position %= myarray.length;

       rotate(myarray, 0, myarray.length -1);

       for (int i = 0; i < myarray.length ; i++) {
           System.out.println(myarray[i]+"  ");
       }

       System.out.println("       ");

       rotate(myarray, 0, position -1);

       rotate(myarray, position, myarray.length -1);

       for (int i = 0; i < myarray.length ; i++) {
           System.out.println(myarray[i]+"  ");
       }
       return true;

   }

   private static void rotate(int[] array,int start, int end){

        while (start < end){

            int temp = array[start];

            array[start] = array[end];

            array[end] = temp;

            start ++;
            end --;

        }

   }

}
