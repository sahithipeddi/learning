package com.learning.Basics.Generics;


import java.util.ArrayList;

class Machine{

    @Override
    public String toString() {
        return "I'm a machine";
    }

    public void start(){
        System.out.println("Mahine starting");
    }
}

class Camera extends Machine{

    @Override
    public String toString() {
        return "I'm a Camera";
    }

    public void snap(){
        System.out.println("SNAP");
    }

}

public class GenericsWildCards {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList <String>();

        list.add("One");
        list.add("two");

        showList(list);


        ArrayList<Machine> machines = new ArrayList <Machine>();

        machines.add(new Machine());
        machines.add(new Machine());

        showMachines(machines);

        ArrayList<Machine> machine1 = new ArrayList <Machine>();

        machine1.add(new Camera());
        machine1.add(new Camera());

        showMachines(machine1);

        ArrayList<Camera> machine2 = new ArrayList <Camera>();

        machine2.add(new Camera());

        machine2.add(new Camera());

        showMachine(machine2);


    }

    private static void showMachine(ArrayList<? extends Machine> machine2) {

        for(Machine machineType: machine2){

            System.out.println(machine2);

            machineType.start();

        }

    }

    private static void showMachine1(ArrayList<? super Camera> machine2) {

        for(Object machineType: machine2){

            System.out.println(machine2);



        }

    }

    public static void showMachines(ArrayList<Machine> machine){

        for(Machine machinetype: machine){

            System.out.println(machinetype);
        }

    }

    public static void showList(ArrayList<String> list){

        for(String value: list){

            System.out.println(value);
        }

    }





}
