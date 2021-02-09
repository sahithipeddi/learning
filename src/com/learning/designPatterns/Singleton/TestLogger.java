package com.learning.designPatterns.Singleton;

public class TestLogger {

    public static void main(String[] args){

        Logger obj1 = Logger.getInstance();
        Logger obj3 = Logger.getInstance();

        System.out.println("obj3 "+obj3.hashCode());
        System.out.println("obj1 "+obj1.hashCode());

        TestLogger obj5 = new TestLogger();
        TestLogger obj7 = new TestLogger();

        System.out.println("obj5 "+obj5.hashCode());
        System.out.println("obj7 "+obj7.hashCode());


    }
}
