package com.learning.DataStructures.Arrays;

public class SingleDiemntionalArrayTest {

    public static void main(String[] args) {


        SingleDimensionalArray array = new SingleDimensionalArray(10);

        array.insertionArray(0,0);
        array.insertionArray(1,1);
        array.insertionArray(2,2);
        array.insertionArray(3,3);
        array.insertionArray(4,4);
        array.insertionArray(5,5);
        array.insertionArray(6,6);
        array.insertionArray(7,7);
        array.insertionArray(8,8);
        array.insertionArray(12,9);

        array.traverseArray();

        array.accessingArray(7);

        array.searchForValueinArray(13);

    }
}
