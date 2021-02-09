package com.learning.DataStructures.Arrays;

public class TwoDArrayTest {

    public static void main(String[] args) {
        TwoDArray myarray = new TwoDArray(2,2);

        myarray.traverseArray();

        myarray.insertValue(0,0,1);
        myarray.insertValue(0,1,1);
        myarray.insertValue(1,0,1);
        myarray.insertValue(1,1,1);

        System.out.println("New array is: ");
        myarray.traverseArray();

        myarray.accessingCell(1,1);

        myarray.deleteArrayelement(1,1);

        myarray.accessingCell(1,1);

        myarray.searchElementbyValue(0);

        myarray.deleteArray();

        myarray.traverseArray();

    }
}
