package com.learning.DataStructures.Sorting;

public class QuickSort {

    public static void quickSort(int[] array, int p, int q){

        if(p<q){

            int pivotPosition = partition(array, p, q);
            quickSort(array, p, pivotPosition-1);
            quickSort(array, pivotPosition+1, q);
        }

    }

    public static int partition(int[] array, int p, int q){

        int i = p-1;

        for (int j = p; j <= q; j++) {

            if(array[j]<= array[q]){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        return i;
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " ");

            System.out.println();
        }

    }
}
