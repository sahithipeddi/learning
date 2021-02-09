package com.learning.Basics;

public class Constructor {

    public static void main(String[] args) {

        Machine machine = new Machine();

        Machine machine2 = new Machine("Sahithi");

        Machine machine3 =new Machine("Tool", 7);
    }

}



/*Constructor has to have same method name as your class name
* We often use it for initializtion of variables */
class Machine{

    private String name;

    private int code;

    public Machine(){

        this("Peddi", 9);

        System.out.println("Constructor running ");

        name = "Sri";

    }

    public Machine(String name){

        this.name = name;

        System.out.println("This name is "+ name);

    }

    public Machine(String name, int code){

        this.name = name;
        this.code = code;

        System.out.println("Third constructor running");

    }


}