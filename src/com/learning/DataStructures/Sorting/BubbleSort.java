package com.learning.DataStructures.Sorting;

public class BubbleSort {

    public int[] bubbleSort(int[] array){

        int n = array.length;

        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < n-1; j++) {

                if(array[j] > array[j+1]){

                    int temp = array[j+1];

                    array [j+1] = array[j];

                    array[j] = temp;
                }

            }

        }

        return array;
    }

    public void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            System.out.println();

        }

    }

}
