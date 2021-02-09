package com.learning.Basics.Encapsulation;

/* Encapsulate the instance variables
*
*  Me
*
*  API - Application Programming Interface
*
*
*
* */

class Plant{

//class variable - ID cant be changed.
    public static final int ID=7;
    private String name;

    private String getData(){

        String data = "Some stuff " + calculateGrowth();

        return data;

    }

    private int calculateGrowth(){

        return 9;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {

        Plant p = new Plant();

        p.getName();



    }
}
