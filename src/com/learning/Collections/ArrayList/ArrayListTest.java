package com.learning.Collections.ArrayList;

import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {

        /*If we don't specify a size of array list it would be defaluted to 10
        *
        * */

        ArrayList<Integer> numbers = new ArrayList <Integer>();

//      Adding into Array List

        numbers.add(10);
        numbers.add(11);
        numbers.add(12);

//      Iterating into Array list

        System.out.println(numbers.get(0));

        System.out.println("\nIteration #1: ");

//        Indexed for loop iteration

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //        Removing Items from list , Be more careful
        System.out.println("\nRemoving items from array ");
        System.out.println(numbers.size() - 1);
        numbers.remove(numbers.size() - 1);

//        If removing items from beginning it is very slow. Use linked lists to remove items from start or items until the middle of array.
        numbers.remove(0);


        System.out.println("\nIteration #2: ");

        for(Integer value: numbers){
            System.out.println(value);
        }


        /*
        * Collections classes are grouped by interfaces. ALl list object implememnts list interfaces
        *
        * Most purposes we use ArrayLists.
        *
        * */

        List values = new ArrayList<String>();

    }

}
