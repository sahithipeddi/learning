package com.learning.Basics;

class Thing{

    public String name;
    public static String description;

    public static int count = 0;

    public int id;

    public Thing(){

        id = count;

        count++;
    }



    public static final int LuckyNumber=9;

    public void showName(){
        System.out.println("Object id: " + id + " and decr is"+ description +" This Name is: "+name);
    }

    public static void showInfo(){
        System.out.println(description);
    }
}

/* Static variables are created only for the class and are only accessible with the class
* These are not instance variables which get their own copy
* Static variables are also known as class variables.
*
* Static methods can only use static Methods. Instances can use static data.
*
*
* Final is java's version of constant and we can't reassign the value
*
* */

public class Static {

    public static void main(String[] args) {

        System.out.println("Count value before creating obj " + Thing.count);

        Thing thing1 = new Thing();

        thing1.name = "bob";

        Thing thing2 = new Thing();

        thing2.name = "su";

        System.out.println("Count value after creating obj " + Thing.count);

//        System.out.println(thing1.name);
//        System.out.println(thing2.name);

        Thing.description = "I'm a thing";

        System.out.println(Thing.description);

        thing1.showName();
        thing2.showName();

        Thing.showInfo();

        System.out.println(Math.PI);

        System.out.println(Thing.LuckyNumber);

//        Thing.LuckyNumber = 9;
    }


}
