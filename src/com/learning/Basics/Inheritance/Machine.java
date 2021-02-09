package com.learning.Basics.Inheritance;

public class Machine {

//    private String name = "Machine type1";
//      protected means it can be accesses anywhere with in the package and also child class.
    protected String name = "Machine type1";

    public void start(){
        System.out.println("machine started");
    }

    public void stop(){
        System.out.println("Machine stopped");
    }


}
