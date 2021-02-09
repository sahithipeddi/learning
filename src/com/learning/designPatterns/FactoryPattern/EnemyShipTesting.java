package com.learning.designPatterns.FactoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args){

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter ship you need: ");

//        String userType = input.nextLine();

        System.out.println("What type of input?");

        if(input.hasNextLine()){

            String typeOfShip = input.nextLine();

//            shipFactory.


        }
    }

}
