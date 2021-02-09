package com.learning.DataStructures.Arrays;

public class TwoDArray {

    int[][] array;

    public TwoDArray(int row, int column) {
        this.array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.MIN_VALUE;
            }
        }
    }


    public void traverseArray(){

        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                    System.out.print(" ");
                }

                System.out.println();
            }
        } catch (Exception e){
            System.out.println("Array is not present" + e);
        }

    }

   public void insertValue(int rowNum, int colNum, int value){

       try{

           array[rowNum][colNum] = value;
       }catch (Exception e){
           System.out.println("error iserting value " + e);
       }

   }

   public void deleteArrayelement(int rowNum, int colNum){

       try{

           array[rowNum][colNum] = Integer.MIN_VALUE;
       }catch (Exception e){
           System.out.println("error deleting value " + e);
       }

   }

   public void searchElementbyValue(int value){

        try {
            for (int i = 0; i < array.length ; i++) {

                for (int j = 0; j< array[i].length; j++){

                    if (array[i][j] == value){
                        System.out.println("Value is present in position: "+array[i][j]);
                        return;
                    }
                }
            }

            System.out.println("Value is nt present");
        }catch (Exception e){
            System.out.println("Array out of bounds" + e);
        }
   }

   public void accessingCell(int rowNum, int colNum){
       try{
           System.out.println("Accesing a cell ");
           System.out.println(array[rowNum][colNum]);
       }catch (Exception e){
           System.out.println("error deleting value " + e);
       }

   }

   public void deleteArray(){
        array = null;
   }
}
