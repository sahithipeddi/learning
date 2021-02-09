package com.learning.Basics.AnonymousClasses;

class Machine{


    public void start(){
        System.out.println("Starting Machine");
    }
}


interface Plant{

    public void grow();
}

public class Anonymous {

    public static void main(String[] args) {

        Machine machine1 = new Machine(){
//This is a child class of Machine which doesn't have a name. This is called anonymous class.
            @Override
            public void start() {
                System.out.println("Camera snapping..");
            }
        };

        machine1.start();

        Plant plant1 = new Plant() {
            @Override
            public void grow() {

                System.out.println("Plant growing");
            }
        };

        plant1.grow();
    }
}
