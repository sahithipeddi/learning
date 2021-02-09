package com.learning.DataStructures.Sorting;

public class QuickSortMain {

    public static void main(String[] args) {

//        int array[] = {9,4,6,3,7,1,2,11,5};

        int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
        QuickSort.quickSort(array, 0, array.length-1);

        QuickSort.printArray(array);

    }
}
