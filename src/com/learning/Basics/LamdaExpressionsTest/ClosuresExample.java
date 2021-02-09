package com.learning.Basics.LamdaExpressionsTest;


import java.util.function.Function;

public class ClosuresExample {

    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        /*doProcess(a, new Process() {
            @Override
            public void process(int i) {

                System.out.println(i+b);

            }
        });*/

        doProcess(a, (p) -> (p+b));

    }

    /*public static void doProcess(int i, Process p){

         p.process(i);
     }*/

    static void  doProcess(int i, Function<Integer, Integer> function){
        Integer value = function.apply(i);
        System.out.println("Value is:"+value);
    }


    interface Process {
        void process(int i);
    }

}