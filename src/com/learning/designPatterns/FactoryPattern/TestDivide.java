package com.learning.designPatterns.FactoryPattern;

import java.util.Scanner;
/*
     This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.


 */


public class TestDivide {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");

        double num1 = input.nextDouble();

        System.out.println("Enter Second number");

        double num2 = input.nextDouble();

        Divide d = new Divide();

//        d.calculate(num1,num2);

        CalculateFactory factory = new CalculateFactory();

        System.out.println("enter obj for action");

       Calculate obj = factory.getCalculation(input.next());

        obj.calculte(num1 , num2);
    }

}
