package com.learning.Basics.AbstractClasses;

public class Camera extends Machine{
    @Override
    public void start() {

        System.out.println("Camera snap");

    }

    @Override
    public void doStuff() {
        System.out.println("Camera doing stff");
    }

    @Override
    public void shutDown() {

        System.out.println("camera shut down");

    }
}
