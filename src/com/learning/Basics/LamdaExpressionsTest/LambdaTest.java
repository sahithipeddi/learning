package com.learning.Basics.LamdaExpressionsTest;


/* Lambda expressions are nothing but a way to pass a value to a block of code
*
*
*
* */

interface Excecutable {

    int execute(int a, int b);

}

interface StringExcecutable {

    int execute(String a);

}

class Runner{

    public void run(Excecutable e){

        System.out.println("Executing code block...");
        int value = e.execute(12,13);

        System.out.println("Return Value is: "+value);

    }

    public void run(StringExcecutable e){

        System.out.println("Executing code block...");
        int value = e.execute("Hello");

        System.out.println("Return Value is: "+value);

    }
}

/*
* runner.run(() -> {
            System.out.println("Multiple blocks");
            System.out.println("I'm extra");
        });
*
*
*  runner.run(new Excecutable() {
            @Override
            public int execute() {
                System.out.println("Hello");
                return 9;

            }
        });

        System.out.println(" ====================================== ");
// For one command
        runner.run(()->{System.out.println("Hi");
        return 10;
        });


        System.out.println(" ====================================== ");

// For Multiple commands

        runner.run(() -> {
            System.out.println("Multiple blocks");
            System.out.println("I'm extra");
            return 8;
        });

        System.out.println(" ====================================== ");
//  For single expression you don't need curly brackets , it can just be a method call

        runner.run(() -> 8);
*
*
*
* (int a) -> 8
*
*(a) -> 8 +a;
*
*
*
*
* */
public class LambdaTest {

    public static void main(String[] args) {

        int z= 20;

        int d =89;

//     Cannot use this in inner classes   z=19;

        Runner runner = new Runner();

        runner.run(new Excecutable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello");
//                Can do this in method of anonymous classes as they have their owen scope
                int d=9;
                return z +9 + a;

            }
        });

        System.out.println(" ====================================== ");
// For one command
        runner.run((int a, int b)->{System.out.println("Hi");
//        Cant re-declare any local variable ; No new scope;  int d= 9;
        return 10;
        });


        System.out.println(" ====================================== ");

// For Multiple commands

        runner.run((int a, int b) -> {
            System.out.println("Multiple blocks");
            System.out.println("I'm extra");
            return 8+a+b+z;
        });

        System.out.println(" ====================================== ");
//  For single expression you don't need curly brackets , it can just be a method call
        runner.run( (a,b) -> {
            System.out.println("Hey");
            return 8+a+b+z ;
        });


        Excecutable x= (a,b) -> {
            System.out.println("Hey");
            return 8+a+b+z ;
        };

        runner.run(x);


    }

}
