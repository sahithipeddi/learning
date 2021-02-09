package com.learning.designPatterns.SuperClassExample;

/*public interface Bike {

    public void bikeVarierty();

}*/

public class Bike{

    public String gears;

    public String speed;

//    public BikeType type;

    public Bike type;



    /*public Bike(String gear, String speed, BikeType type){

        this.gears= gear;

        this.speed = speed;

        this.type = type;

    }
*/
   /* @Override
    public String toString() {
        return "My Bike type is "+ type.bikeVarierty() +" and Gear is " + gears + " and speed is " + speed ;
    }
*/
    public String toString1() {
        String temp = "";
        if (this instanceof MountainBike) {
            temp =  " Gear is " + gears + " and speed is " + speed +" and Biketype is: " +((MountainBike) this).bikeVarierty();
        }

        return temp;
    }

}
