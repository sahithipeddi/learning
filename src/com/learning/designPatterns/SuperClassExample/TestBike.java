package com.learning.designPatterns.SuperClassExample;

public class TestBike {

   public static void main(String[] args){

      /* Bike bike = new MountainBike();

       bike.bikeVarierty();

       bike = new RegularBike();

       bike.bikeVarierty();*/

       /*BikeType bikeType = new MountainBike();

       Bike mBike = new Bike("Six","5", bikeType);

       System.out.println(mBike.toString());


       bikeType = new RegularBike();

       Bike regBike = new Bike("Six","5", bikeType);

       System.out.println(regBike.toString());*/

       Bike bike = new MountainBike();

//       Bike mBike = new Bike("Six","5");

       System.out.println("Bike is: "+bike.toString1());



   }


}
