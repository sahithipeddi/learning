package com.learning.DataStructures.Arrays;

public class SingleDimensionalArray {

    public int arr[] = null;

    public SingleDimensionalArray(int sizeofArray){
       arr = new int[sizeofArray];
        for (int i:
             arr) {
            arr[i] = Integer.MIN_VALUE;
        }

    }

    public void traverseArray(){
        try {

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Element is: " + arr[i]);
            }
        }catch (Exception e){
            System.out.println("Error while traversing" +e);
        }
    }

    public void insertionArray(int location, int value){

        try {

            if (location <= arr.length) {
                arr[location] = value;
            } else {
                System.out.println("Location out of bounds");
            }

        } catch (Exception e) {
            System.out.println("Exception while insertion:" + e);
            System.out.println("Exception while insertion:" + e);
        }


    }

    public void accessingArray(int location){
        try {

            if (location <= arr.length) {
                System.out.println("Location in position :" + location + "is : " +arr[location]);
            } else {
                System.out.println("Location out of bounds");
            }

        } catch (Exception e) {
            System.out.println("Exception while insertion:" + e);
            System.out.println("Exception while insertion:" + e);
        }

    }

    public void searchForValueinArray(int value){

        for (int location:
             arr) {

            if(arr[location] == value){
                System.out.println("Value found in location: " +arr[location]);
                return;
            }

        }
        System.out.println("Value not found in array");
    }


    public void deleteValuefromArray(int position){

        try {
            arr[position] = Integer.MIN_VALUE;
        }catch (Exception e){
            System.out.println("Index out of bounds exception: "+e);
        }


    }

}

