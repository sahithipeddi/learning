package com.learning.Basics.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

//        value type variable
        int value =7;
//        reference type variable
        int[] values;

        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;

        values[1] = 11;

        values[2] = 17;

        for (int i=0; i< values.length; i++ ){

            System.out.println("division is: "+values[i]/2);

        }

        int[] numbers = {1,2,3};

        for (int i=0; i< numbers.length; i++ ){
            System.out.println("number is: "+numbers[i]);
            System.out.println("prime is: "+(numbers[i]+2));

        }



        Scanner input = new Scanner(System.in);

        int length = 4;

        int[] digits = new int[length];


        for(int i = 0; i< length; i++){

            System.out.println("Enter digit");

            digits[i] = input.nextInt();

        }

        for(int digit: digits) {
            System.out.println("digits are: " + digit);
        }
    }
}
