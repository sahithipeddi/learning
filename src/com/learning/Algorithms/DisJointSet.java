package com.learning.Algorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DisJointSet {

    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet();

        set1.add(12);
        set1.add(1);
        set1.add(3);
        set1.add(5);


        Set<Integer> set2 = new TreeSet();

        set2.add(4);
        set2.add(6);
        set2.add(3);

        if(set2.size()< set1.size()){

            for (Integer value:
                 set2) {

                if(set1.contains(value)){
                    System.out.println("Disjoint set");
                }
                else{
                    System.out.println("Joint Set");
                }

            }
        }
        else {

            for (Integer value:
                    set1) {

                if(set2.contains(value)){
                    System.out.println("Disjoint set");
                }
                else{
                    System.out.println("Joint Set");
                }

            }
        }

    }

}
