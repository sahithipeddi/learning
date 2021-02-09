package com.learning.Basics.Arrays;


import javax.xml.crypto.Data;

class Person {

//    Instance variables

    String name;

    int age;

/*
    Classes contain
    1) Data
    2) Subroutines(methods)

    Subroutines which is part of class is called a method.

*/

    void speakName() {

        for (int i = 0; i < 3; i++) {
            System.out.println("My name is: " + name + " and i'm " + age + " years old");
        }


    }

    void sayHello(){

        System.out.println("Helllo "+name );
    }
}

    public class APP {
        public static void main(String[] args) {

            Person person1 = new Person();

            person1.age = 40;

            person1.name = "Sahithi";

            person1.speakName();

            person1.sayHello();

            Person person2 = new Person();

            person2.age = 50;

            person2.name = "Smith";

            person2.speakName();

        }
    }
