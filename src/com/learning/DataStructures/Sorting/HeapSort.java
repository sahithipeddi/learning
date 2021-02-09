package com.learning.DataStructures.Sorting;

import com.learning.DataStructures.BinaryTrees.BinaryHeap;

public class HeapSort {

    public static void heapSort(int[] array){

        BinaryHeap myHeap = new BinaryHeap(array.length);

        for (int i = 0; i <array.length ; i++) {

            myHeap.insert(array[i]);

        }

        int[] sortedArray = new int[array.length];

        for (int i = 0; i <array.length ; i++) {

            sortedArray[i] = myHeap.extractElement();
            System.out.println(sortedArray[i]);
        }

    }
}
