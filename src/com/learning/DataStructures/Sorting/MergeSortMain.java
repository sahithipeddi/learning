package com.learning.DataStructures.Sorting;

public class MergeSortMain {

    public static void main(String[] args) {

        int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};

        MergeSortTutorial.mergeSort(array, 0, array.length-1);

        MergeSortTutorial.printArray(array);

    }


}
