package com.learning.Basics;

import java.util.Scanner;

public class UserInput {

    /*
Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double etc. and strings.
    To create an object of Scanner class, we usually pass the predefined object System.in,
    which represents the standard input stream. We may pass an object of class File if we want to read input from a file.

hasNext() is used to check if the next value we read is of a certain type or if the input has ended (EOF marker encountered).
*/


    public static void main(String[] args) {

/*//        Create scanner object
        Scanner input = new Scanner(System.in);

        //   Output the prompt
        System.out.println("Enter a line of text");

//        Wait for user to enter line
        String line = input.nextLine();

        System.out.println("you entered a line: "+line);`



        System.out.println("Enter a int");

    //        Wait for user to enter line
    int number = input.nextInt();

        System.out.println("you entered a value: "+number);*/

   Scanner input2 = new Scanner(System.in);

//  Enter values for variables
    int sum = 0, count = 0;

//   Check if a value is available
        while (input2.hasNextInt()){
            int num = input2.nextInt();
            sum += num;
            count++;
        }
        int mean = sum/count;
        System.out.println("mean: "+mean);


    }


}