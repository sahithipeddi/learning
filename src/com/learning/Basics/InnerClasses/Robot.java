package com.learning.Basics.InnerClasses;

public class Robot {

    private int id;

//    Non statis inner classes

    class Brain{

//        This has access to instance data

        public void thinks(){
            System.out.println("Robot: " + id + " is thinking");
        }

    }

    public static class Battery{

        public void charge(){
            System.out.println("Battery charging ... ");
        }
    }

    public Robot(int id){
        this.id = id;
    }

    public void start(){
        System.out.println("Starting Robot with ID: "+id);
        Brain brain = new Brain();

        brain.thinks();

        String name = "Robert";

        class Temp{
            public void doSomething(){
                System.out.println("Id is: "+id);
                System.out.println("My name is: "+name);

            }
        }

        Temp temp = new Temp();
        temp.doSomething();

    }



}
