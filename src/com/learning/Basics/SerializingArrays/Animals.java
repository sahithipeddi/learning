package com.learning.Basics.SerializingArrays;

import java.io.Serializable;

public class Animals implements Serializable {

    private String name;

    private int id;

    public Animals(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }


    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
