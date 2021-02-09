package com.learning.designPatterns.SuperClassExample;

public class Contact {

    public String name;

    public String toString() {
        String temp = "";
        if (this instanceof Friend) {
            temp =  "Work Name: " + name + " phn Number: " + ((Friend) this).phnNumber;
        } else if (this instanceof Work) {
            temp = "Work Name: " + name + " Email: " + ((Work) this).email;

        }

        return temp;
    }
}
