package com.learning.Basics;

public class IfLoops {
    public static void main(String[] args) {
        /*boolean condition = 6 == 6;

        System.out.println("Condition: "+condition);

        if(condition){
            System.out.println("Print condition true for if loop");
        }*/

        int myInt = 20;

        if (myInt < 4){
            System.out.println("Yes it's less than 4");
        }else if (myInt == 20){
            System.out.println("Yes it's equal to 20");
        }else{
            System.out.println("Yes it's greater than 4");
        }

        int loop = 1;

        while (true) {
            System.out.println("print loop "+loop);

            if (loop == 5) {
            System.out.println("loop value: "+loop);
                break;

            }
            loop++;

        }
    }
}
