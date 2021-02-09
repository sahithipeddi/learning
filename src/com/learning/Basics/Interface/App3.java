package com.learning.Basics.Interface;

public class App3 {
    public static void main(String[] args) {

        Machine machine1 = new Machine();

        machine1.start();

        Person person1 = new Person("John");

        person1.greet();

        Info info1 = new Machine();

        info1.showInfo();

        Info info2 = person1;

        info2.showInfo();

        Info.operation operation = new Machine();

        operation.typeOfOperation();

        System.out.println("Machine info");

        outputInfo(machine1);

        outputInfo(person1);

        Info.sequence.verifyState(info2);

    }


    public static void outputInfo(Info info){

        info.showInfo();

    }
}
