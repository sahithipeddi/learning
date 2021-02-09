package com.learning.Basics.AccessSpecifiers;

public class Field {

   private Plant plant = new Plant();


    public Field(){

//        Size is protected and in same class as size

        System.out.println(plant.size);


    }
}
