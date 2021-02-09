package com.learning.Basics.PolymorphismTP;

import com.learning.designPatterns.FactoryPattern.Substract;

public class PolymorphismTP {

    /* Method overloading
    *
    *  If there are multiple methods with different parameter values it is called Method Overloading.
    *  We can perform method overloading to perform this type of operation quickly.
    *  Advantages of Method Overloading: Increases readability of a program
    *  Different ways to override a method
    *  1) By changing number of arguments.
    *  2) By changing data type.
    *
    *  Overloading java main method is also possible.
    *
    *
    *
    *  Difference between Method Overloading and Method Overriding
    *
    *  Method Overloading:
    *
    *  1) To increase the readability of program
    *  2) performed with in the class
    *  3) Parameters must be different
    *  4) example of Compile time Polymorphism
    *  5) In Java, method overloading can only be performed by changing return type of method.
    *
    *  Method Overriding:
    *
    *  1) Method overriding is used to perform specific implementation of a method that is already part of super class.
    *  2) Method Overriding uses Inheritance concepts.
    *  3) Parameters must be same in this case.
    *  4) It's an example of run time polymorphism
    *  5) Return type must be same or covariant in method overriding.
    *
    *
    * */


    public static void main(String[] args) {

        System.out.println("main with String");

        Addition add = new Addition(1,2);

        Addition add1 = new Addition(1,3,4);

        Sub subNum = new Sub();

        subNum.sub(3,7);
        subNum.sub(4.0,42.3);


    }

    public static void main(String args){System.out.println("main with String");}
    public static void main(){System.out.println("main without args");}

}
//Example for change in number of arguments
class Addition{

    private int a;
    private int b;
    private int c;

    public Addition(int a, int b){

        this.a = a;
        this.b = b;
        System.out.println("Addd: "+(a+b));
    }
    public Addition(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Addd: "+(a+b+c));
    }

}

//Example for changing data types

class Sub{

    public void sub(int a, int b){

        System.out.println("SU: "+(a-b));
    }
    public void sub(double a, double b){

        System.out.println("sub: "+(a-b));
    }


}

