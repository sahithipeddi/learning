package com.learning.Basics.Enum;

import java.security.SecureRandom;

public enum  Animals {

    CAT("Fregus"),DOG("Bubloo"),AMERICA("db");

    private String name;

    Animals(String name){

        this.name = name;

    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Animals{name='" + name + '\'' +
                '}';
    }

}
