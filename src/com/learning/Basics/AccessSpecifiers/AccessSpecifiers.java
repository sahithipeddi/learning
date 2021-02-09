package com.learning.Basics.AccessSpecifiers;

/*
* Private - Only with in same class
* Protected - subclass, same package
* No Modifier- same package only
* Public - everywhere
*
* Can't declare classes private as it's only applied for instance variables.
* */


public class AccessSpecifiers {

    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(plant.SEQNUM);

//        Won't work as type is private
//        System.out.println(plant.type);

//        If this class is not in the same package as Plant it wouldn't work as size is protected.
//        No access specifier can be accesses in the same class and package
        System.out.println(plant.size);




    }

}
