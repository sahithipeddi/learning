package com.learning.Basics.Recursion;

/*
* Recusrion - A subroutine calls subroutine
*
*
* */

public class RecursionDemo {

    public static void main(String[] args) {

        System.out.println("Simple Recursion: ");
//        call(4);

//e.g. to calculate Factorial of 4 -- > 4! = 4*3*2*1


        System.out.println("Factorial value is: " + calculate(4));
    }


    /*This method calls itself recursively which is problematic
    *
    * This returns StackOverFlow error.  java.lang.StackOverflowError java.lang.instrument ASSERTION FAILED ***:
    *
    * There is a memory type in JVM called stack. it's used for local variables and remembering which method called which method.
    * So that we know which method to return after the method is called.
    *
    * it's different from Heap. Heap is an area of memory which is where objects are allocated when we we use new operator.
    *
    * Stack is basically a simple type of memory which remembers functions and it's return types
    *
    *
    * Problem with recursion is to avoid stack overflow. Some situations
    *
    *
    * */
    private static int  calculate(int value) {

        if (value == 1) {
            System.out.println("Value in IF");
            return value;
        }

//        System.out.println("Value "+value);
        int count = calculate(value - 1) * value;
        System.out.println("count: "+count);
        return count;

    }

    private static void call(int value){


        System.out.println("Value is: "+value);

        if(value == 1){
            System.out.println("Value is: "+value);

            return;
        }

        call(value -1);

    }
}
