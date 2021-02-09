package com.learning.designPatterns.SuperClassExample;

public class TestClass {

    public static void main(String[] args){

        System.out.println("Aobj");
        /*ClassA Aobj= new ClassA();

        Aobj.methodA();*/

        System.out.println("Bobj");
        ClassB Bobj= new ClassB();

        Bobj.methodB();
        Bobj.methodA();

        System.out.println("Callin Bobj from A");

        ClassA obj = new ClassB();
        obj.methodA();
        obj.methodB();

        System.out.println("Test Class");



    }
}

