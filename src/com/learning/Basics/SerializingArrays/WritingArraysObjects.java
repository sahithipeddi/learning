package com.learning.Basics.SerializingArrays;

import com.learning.Basics.Serialization.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WritingArraysObjects {

    public static void main(String[] args) {
        Animals[] animals = {new Animals(1,"Doggy"), new Animals(2, "Kitty"), new Animals(3, "turtle")};

        ArrayList<Animals> animalsArrayList = new ArrayList <Animals>(Arrays.asList(animals));

        try (FileOutputStream fl = new FileOutputStream("Animals.bin"); ObjectOutputStream ooos = new ObjectOutputStream(fl)) {

                ooos.writeObject(animals);

                ooos.writeObject(animalsArrayList);

                ooos.writeInt(animalsArrayList.size());

                for (Animals animal:animalsArrayList){
                    ooos.writeObject(animal);
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
