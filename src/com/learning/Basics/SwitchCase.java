package com.learning.Basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Input:");

        String operation = input.nextLine();

//        Can only be used on certain kinds of variables likes strings and integers

        switch (operation){
            case "start":
                System.out.println("Start the application ");
                break;
            case "stop":
                System.out.println("Stop the application ");
                break;
                default:
                    System.out.println("Command not found");
        }
    }
}
