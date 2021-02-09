package com.learning.Basics.Polymorphism;


/*Polymorphism - Many shapes*/
public class Polymorphism {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Treee tree = new Treee();


//        Object
        Plant plant2 = tree;

        plant2.grow();

        tree.shedLeaves();


//        ((Treee) plant2).shedLeaves();

            doGrow(tree);


    }


    public static void doGrow(Plant plant) {

        plant.grow();

    }
}
