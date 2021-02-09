package com.learning.Basics.LamdaExpressionsTest;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionHandlerJB {

    public static void main(String[] args) {

        int[] someNumbers = {1,2,3,4,5,6,7};

        int key =2;

//        processNumbers(someNumbers,key, (n) -> System.out.println(n));

//        process(someNumbers,key, (v,k) -> {
//            try{
//            System.out.println(v/k);}catch (ArithmeticException e){
//                System.out.println("Error while Division "+e);
//            }
//        });

        process(someNumbers,key,wrapper((v,k) -> System.out.println(v / k)));
    }

    private static void processNumbers(int[] someNumbers, int key,Consumer numbers) {

        for(int i :someNumbers){
            numbers.accept(i*key);
        }
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {

        for(int i :someNumbers){
            consumer.accept(i,key);
        }
    }


   /* private static BiConsumer <Integer, Integer> wrapper(BiConsumer<Integer,Integer> consumer){
//        return consumer;
        return (v,k)-> {
            System.out.println("Hi");
            System.out.println(v+k);
        };
    }*/

    private static BiConsumer <Integer, Integer> wrapper(BiConsumer<Integer,Integer> consumer) {
//        return consumer;
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception in wrapper lambda" + e);
            }

        };
    }
}