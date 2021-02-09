package com.learning.designPatterns.Singleton;

public class TestPrint {

    public static void main(String[] args){

        Print paper1 = Print.getInstance();

        System.out.println(paper1.hashCode());

    }
}
