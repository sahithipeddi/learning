package com.learning.designPatterns.SuperClassExample;

/*
public class MountainBike implements Bike{

    public void bikeVarierty(){

        System.out.println("I'm in mountain Bike");
    }

}
*/


/*
public class MountainBike implements BikeType{

    public String bikeVarierty(){

        System.out.println("I'm in mountain Bike");

        return "mBike";
    }

}
*/

public class MountainBike extends Bike{

    public String bikeVarierty(){

        System.out.println("I'm in mountain Bike");

        return "mBike";
    }

}
