package com.learning.Basics.AbstractClasses;

public class Car extends Machine {
    @Override
    public void start() {

        System.out.println("Car Starting");

    }

    @Override
    public void doStuff() {

        System.out.println("Car doing stff");

    }

    @Override
    public void shutDown() {

        System.out.println("shutdown car");

    }
}
