package com.learning.designPatterns.SuperClassExample;

/*
public class RegularBike implements Bike{

    public void bikeVarierty(){

        System.out.println("I'm in Regular Bike");
    }
}
*/


public class RegularBike implements BikeType {

    public String bikeVarierty() {

        System.out.println("I'm in Regular Bike");

        return "rBike";
    }
}
