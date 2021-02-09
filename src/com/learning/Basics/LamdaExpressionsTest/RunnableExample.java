package com.learning.Basics.LamdaExpressionsTest;

public class RunnableExample {

    public static void main(String[] args) {

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing inside Runnable");
            }
        });

        myThread.run();


        Thread lambdaThread = new Thread(() ->
                System.out.println("Hellow Running thread"));

        lambdaThread.run();
    }

}


