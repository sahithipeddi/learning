package com.learning.Basics.Inheritance;


//Car is a child class of Machine. Car Inherits from machine.

public class Car extends Machine{

    /*public void start(){
        System.out.println("car started");
    }

*/

//    @Override -> It will check if it's really a overridden method by checking in machine class.

    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void wipeWindShield(){
        System.out.println("Wiing wind shield");
    }

    public void showInfo(){
//      It will throw eerror for name which is a private variable. if we get rid of private in Machine class we can access it across package.

        System.out.println("Car Name: "+name);
    }


}
