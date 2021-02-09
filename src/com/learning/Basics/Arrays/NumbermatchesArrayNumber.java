package com.learning.Basics.Arrays;

public class NumbermatchesArrayNumber {

    public static void main(String[] args) {
        int matcher = 4;

        int[] arrayOfNumbers= {1,2,3,4};

        for(int number:arrayOfNumbers){

            if(number == matcher){
                System.out.println("Yayy number matches");
                break;
            }
            System.out.println("Number is: "+number+" which did not match :(");
        }

    }
}
