package com.learning.Basics.LamdaExpressionsTest;

@FunctionalInterface
interface Greeting{

    public void perform();

//    public void sayHello();

}

class HelloWorldGreeting implements Greeting{

    @Override
    public void perform() {

        System.out.println("Performing");

    }

    /*public void sayHello(){
        System.out.println("Saying Hello");
    }*/
}


public class LamdaTest2 {

    public void greet(Greeting greet){

        greet.perform();
//        greet.sayHello();

    }

    public static void main(String[] args) {


        LamdaTest2 greeter = new LamdaTest2();

//        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();

//        greeter.greet(helloWorldGreeting);

        greeter.greet(()-> {
            System.out.println("performing");
        });


    }

}
