package com.learning.Basics.Transient;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 109238l;

//    With Use of transient, It sets the default value of a variable.

    private transient int id;

    private String name;

    private static int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(){
        System.out.println("Default Constructor");
    }

    public Person(int id, String name){

        this.id = id;
        this.name = name;

        System.out.println("Two args Constructor");


    }

    public int getCount(){return count;}

    public static void setCount(int count) { Person.count = count;}

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}


