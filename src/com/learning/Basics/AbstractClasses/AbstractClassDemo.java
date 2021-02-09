package com.learning.Basics.AbstractClasses;
/*These are something we can use as part of hierarchy.
* But we need to keep the base as it is.
*
* CAmera and Cars have some functionality in common. Then the common functionality can be added to Pattern
*
* Machine doesn't have any functionality so to prevent instantiating Machine variables we can make Machine abstract.
*
* When we have abstract class as a parent class, we have to make sure that the child class have to be wtv parent class is.
*
* A car is a machine here.
*
* A class can implement many interfaces. But we can only implement one abstract class.
*
*
* If we extnd parent class, child class has fundamental identity.
*
*
* */

public class AbstractClassDemo {

    public static void main(String[] args) {
        Camera cam1 = new Camera();

        cam1.setId(1);

        Car car1 = new Car();

        car1.setId(18);

        car1.run();

        cam1.run();

    }

}
