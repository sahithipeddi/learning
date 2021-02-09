package com.learning.Basics;

class Dog{

   /*

   com.learning.Basics.Dog@610455d6  --> 610455d6 = hashcode

   public String toString(){
        return "hello";
    }
*/

   private String name;

   private int id;

   public Dog(int id, String name){

       this.id = id;

       this.name= name;

   }

    public String toString(){

       /*StringBuilder sb = new StringBuilder();

       sb.append(id).append(" : ").append(name);
//        return id+ " : "+ name;

        return sb.toString();*/


       return String.format("%-2d: %s", id, name);
    }


}


public class ToString {

    public static void main(String[] args) {

        Dog dog1= new Dog(9,"Tom");

        Dog dog2= new Dog(1,"Rodger");

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        String dogFName = "Demo";
        String dogLName = "Doggy";

        System.out.println(dogFName+" "+dogLName);


    }
}
