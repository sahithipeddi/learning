package com.learning.Basics.Generics;

import java.util.ArrayList;
import java.util.HashMap;

class Animal<T>{

    T obj;

    Animal(T obj){

        this.obj = obj;}

     public T getObject(){
         return this.obj;
        }

}


class Test<T,U>{

    T obj1;

    U obj2;

    Test(T obj1, U obj2){

        this.obj1 = obj1;
        this.obj2 = obj2;

    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

}


public class Generics {

    public static void main(String[] args) {

//        ArrayList manages array internally with out thinking about size.

//        Before Java5

        ArrayList list = new ArrayList();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        String fruit = (String) list.get(2);

        System.out.println(fruit);


/*
        In Java 5 We have generics introduced and we have parametrized classes.
        Idea is if we have a class that has 2 pr more objects we can specify what kind
        of objects we want the class to work with.

        New Style is:
*/



        ArrayList<String> strings = new ArrayList <String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("aligator");

        String animal = strings.get(1);

        System.out.println(animal);


        /*There can be more  than one type of arguments */

        HashMap<Integer, String> map = new HashMap <Integer, String>();

        /*  Java 7 style  */


        ArrayList<Animal> someList  = new ArrayList <>();

        Animal<Integer> obj = new Animal <Integer>(17);

        System.out.println(obj.getObject());

        Animal<String> obj1 = new Animal <String>("Hi");

        System.out.println(obj1.getObject());


        Test<String , Integer> obj3 = new Test<String, Integer>("Hi",13);

        obj3.print();
    }
}
