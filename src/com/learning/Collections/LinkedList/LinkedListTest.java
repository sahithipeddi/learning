package com.learning.Collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();

        List<Integer> linkedList = new LinkedList <Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("Linkedlist", linkedList);

    }

    private static void doTimings(String type, List<Integer> list){

        for ( int i=0; i<1E5; i++){

            list.add(i);
        }

        long start = System.currentTimeMillis();

//       It's a bit slower to Add items at the end of linked list
/*        for (int i= 0; i<1E5; i++){
            list.add(i);
        }*/

//      Add items elsewhere in the list

//      Very slower to add items at the beginning of the list for ArrayList

        for(int i = 0; i<1E5; i++){

            list.add(0,i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " +(end - start) + " ms for type: "+type);

    }
}
