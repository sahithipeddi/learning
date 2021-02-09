package com.learning.Basics.Enum;

public class EnumDemo {

    public static final int DOG = 0;
    public static final int MOUSE = 1;
    public static final int CAT = 2;

    public static void main(String[] args) {
        int animal = CAT;

        switch (animal){

            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("MOUSE");
                break;
            case CAT:
                System.out.println("CAT");
                break;

        }

        Animal enumAnimal = Animal.CAT;

        switch (enumAnimal){

            case CAT:
                System.out.println("CAT");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("MOUSE");
                break;
             default:
                 break;
        }

        System.out.println(Animal.CAT.getClass());

        System.out.println(Animal.DOG instanceof Animal);

        System.out.println("Enum Name as a String: " + Animals.CAT.name());

        System.out.println(Animal.DOG instanceof Enum);

        System.out.println(Animals.DOG.getName());

        System.out.println(Animals.CAT);

        for (Animals animalValue:
                Animals.values()) {

            System.out.println("Animal is:" + animalValue);

        }

        Animals animal2 = Animals.valueOf("CAT");

        System.out.println(animal2);

    }
}
