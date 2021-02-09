package com.learning.Collections.Iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterartorsTest {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList <String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        /*If you have to remove items from a list while iterating you have to use a iterator
        *
        * To add items to a list while iterating you can use list iterator.
        *
        *
        * */

       Iterator<String> it = animals.iterator();

       while(it.hasNext()) {
           String animal = it.next();
           System.out.println(animal);

           if(animal.equals("cat")){
               it.remove();
           }



       }
       System.out.println();

//Modern iteration
        for (String anima:
                animals) {

            System.out.println(anima);

//            animals.remove(2); --> This will throw concurrent modification exception.
            
        }

        /*List iterator Example*/

        LinkedList<Integer> numbers = new LinkedList <Integer>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        ListIterator iterator = numbers.listIterator();

        while (iterator.hasNext()) {

            System.out.println("Iterator: "+iterator.next());
            iterator.add(18);
        }

        System.out.println(numbers);

    }
}
