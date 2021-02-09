package com.learning.Collections.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest

{

    public static void main(String[] args) {

/*Hashset doesn't remember order
*
* If you want to order your items in the way they're added use linkedhashset. Linked hashset is like a hashset which has linked list
*
* Treeset arrange them in natural order
*
*
*
* */
//        Set<String> set1 = new HashSet <String>();

        Set<String> set1 = new LinkedHashSet<String>();

//        Set<String> set1 = new TreeSet <String>();

        if(set1.isEmpty()){
            System.out.println("Set is at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("muse");
        set1.add("snake");
        set1.add("bear");

//        Addin duplicate items in set

        if(set1.isEmpty()){
            System.out.println("Set is not emoty ar end");
        }

        set1.add("dog");

        System.out.println(set1);

//Iterarion

        for (String element:
             set1) {

            System.out.println(element);
            
        }

//        Does seet contain a given item

        if (set1.contains("advark")){
            System.out.println("yes");
        }
        if (set1.contains("car")){
            System.out.println("yes");
        }

//Set 2 contains some common elements in set1 and new elements

        Set<String> set2 = new TreeSet <String>();

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("bear");


//        INtersection

        Set<String> intersection = new LinkedHashSet <String>(set1);

        System.out.println(intersection);


        intersection.retainAll(set2);

        System.out.println(intersection);

//        Difference

        Set<String> difference = new LinkedHashSet <String>(set1);

        difference.removeAll(set2);

        System.out.println(difference);
    }
}
