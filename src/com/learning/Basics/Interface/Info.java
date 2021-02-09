package com.learning.Basics.Interface;

/*Interfaces dont have code they only have methods*/

public interface Info {

    public void showInfo();

    public interface operation{

        public void typeOfOperation();

    }

    class sequence {

        public static boolean verifyState(Info a) {
            System.out.println("true if object implementing class A looks to be in a valid state");
            return (true);
        }
    }
}
