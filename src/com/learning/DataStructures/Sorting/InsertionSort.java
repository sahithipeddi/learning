package com.learning.DataStructures.Sorting;

public class InsertionSort {


    public static int[] insertionSort(int[] array){

        int n = array.length;

        for (int i = 1; i < array.length; i++) {

            int temp = array[i], j = i;

            while (j>0 && array[j-1]> temp){

                array[j] = array[j-1];

                j--;

            }

            array[j] = temp;

        }


        return array;
    }


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " ");

            System.out.println();
        }

    }
}
