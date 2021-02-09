package com.learning.Basics.SerializingArrays;

import com.learning.Basics.Enum.Animal;
import com.learning.Basics.Serialization.Person;

import java.io.*;
import java.util.ArrayList;

public class ReadingArraysObjects {

    public static void main(String[] args) {


        try(FileInputStream fl = new FileInputStream("Animals.bin"); ObjectInputStream oos = new ObjectInputStream(fl);){

            Animals[] animal = (Animals[]) oos.readObject();

            ArrayList<Animals> animalArrayList = (ArrayList <Animals>) oos.readObject();

            int num = oos.readInt();

            for(int i=0; i<num; i++){

                Animals animals = (Animals) oos.readObject();

                System.out.println(animals);

            }

            for(Animals animals:animal){

                System.out.println(animals);
            }

            for(Animals animals:animalArrayList){

                System.out.println(animals);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
