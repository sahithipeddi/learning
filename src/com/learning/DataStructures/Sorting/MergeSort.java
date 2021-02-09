package com.learning.DataStructures.Sorting;

public class MergeSort {


    public static void mergeSort(int[] array, int left, int right){

        if(right> left){

            int middle = (left + right)/2;

            mergeSort(array, left, middle);
            mergeSort(array, middle+1, right);
            merge(array, left, middle, right);
        }

    }

    public static void merge(int[] array ,int left, int middle, int right ){

        int[] leftTemp = new int[middle-left+2];

        int[] rightTemp = new int[right-middle+1];

        for (int i = 0; i <= middle-left; i++) {

            leftTemp[i] = array[left+i];
        }

        for (int i = 0; i < right - middle; i++) {

            rightTemp[i] = array[middle+1+i];

        }

        leftTemp[middle-left+1] = Integer.MAX_VALUE;
        rightTemp[right- middle] = Integer.MAX_VALUE;

        int i =0,j = 0;

        for (int k = left; k <= rightTemp.length; k++) {

            if(leftTemp[i] < rightTemp[j]){

                array[k] = leftTemp[i];
                i++;

            }else if(leftTemp[i] > rightTemp[j]) {
                array[k] = rightTemp[j];
                j++;
            }

        }
    }


    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " ");

            System.out.println();
        }

    }

}
