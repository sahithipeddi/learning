package com.learning.Basics.PassingByValue;

public class PassbyValueTest {

    public static void main(String[] args) {


        PassbyValueTest test = new PassbyValueTest();

        int value = 7;

      /*Copying data from one variable to another
      *
      * Variable which is declared in the method can be only referred in this method. Below way of sending data to another method
      * is usually referred to as passing by value
      * */

        System.out.println("1. Value is: " +value);

        test.show(value);

        System.out.println("4. Value is: " +value);

//        ===========================

        Person person = new Person("George");

        System.out.println("1. Person is: " +person);

        /* Passing by value is - When you send a value/object to a method the memory value is not the same
         *
          * As the memory value changes in other instance it is called pass by value unlike C++ if a variable is modified in the
          *
          * method it is set to the original variable/object.
          *
          *
          * */

        test.show(person);

        System.out.println("4. Person is: " +person);

    }

    public void show(int value){

        System.out.println("2. Value is: " +value);

        value = 8;

        System.out.println("3. Value is: " +value);
    }


    /*This is called Method overloading as a method name can be used multiple times in a class untill and unless there are arguments
    * in the method which are different.
    * */
    public void show(Person person){

        System.out.println("2. Person is: " +person);

            person.setName("Sri");

        person = new Person("Mike");

        System.out.println("3. Person is: " +person);

    }

}
