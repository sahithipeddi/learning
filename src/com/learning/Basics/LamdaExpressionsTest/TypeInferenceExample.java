package com.learning.Basics.LamdaExpressionsTest;

public class TypeInferenceExample {

    public static void main(String[] args) {

        StringLengthLamda stringLength = (s) -> s.length();

        System.out.println(stringLength.getlength("Hello Lamda"));

        printLambda(stringLength);

    }

    public static void printLambda(StringLengthLamda stringLengthLamda){
        System.out.println(stringLengthLamda.getlength("Hi There"));
    }

}


interface StringLengthLamda{

    int getlength(String s);

}