package com.learning.Basics.Arrays;

public class ArrayOfStrings {

    public static void main(String[] args) {

        String[] words= new String[3];

        words[0]="Hello";
        words[1]="welcome";
        words[2]="you";

        System.out.println(words[1]);

        String[] fruits = {"apples", "banans" , "pear", "kiwi"};

        for(String fruit:fruits){

            System.out.println("FRUITS"+fruit);

        }

        String text;

        String[] names = new String[3];

        System.out.println("Names: "+names[0]);

    }
}
