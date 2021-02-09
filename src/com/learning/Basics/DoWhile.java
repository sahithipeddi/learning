package com.learning.Basics;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;

        /*System.out.println("Enter a number");

        int value = scanner.nextInt();

        while (value!=5){
            System.out.println("Enter a number1: ");
            value = scanner.nextInt();
        }
        System.out.println("We got 5: "); */
        do{
            System.out.println("Enter a number");
            value = scanner.nextInt();
        }while (value !=5);{
            System.out.println("We got 5: ");
        }
    }
}
