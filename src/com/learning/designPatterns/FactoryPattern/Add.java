package com.learning.designPatterns.FactoryPattern;

public class Add implements Calculate {

    public void calculte(double a, double b){

        System.out.println("a+b is: "+ (a+b));

    }
}
