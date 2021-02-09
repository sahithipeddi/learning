package com.learning.Basics.Interface;

public class Machine implements Info.operation,Info{

    private int id =7;

    public void start(){

        System.out.println("Machine started");

    }

    public void showInfo() {

        System.out.println("Machine Id is: "+id);

    }

    @Override
    public void typeOfOperation() {

        System.out.println("Starting Machine with id:"+id);

    }

    public static interface Startable {

        public void start();
        public void stop();
    }
}
