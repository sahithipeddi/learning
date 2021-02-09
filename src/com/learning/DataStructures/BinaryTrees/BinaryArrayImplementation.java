package com.learning.DataStructures.BinaryTrees;

public class BinaryArrayImplementation {

    int lastUsedIndex;
    int[] binaryArray;

    public BinaryArrayImplementation(int size){

        binaryArray = new int[size+1];
        lastUsedIndex = 0;

    }



    public void insert(int value){

        if(lastUsedIndex == binaryArray.length -1){
            return;
        }
        else {
            binaryArray[lastUsedIndex+1] = value;
            lastUsedIndex++;
        }
    }
    
    public void search(int value){

        for (int i = 0; i < binaryArray.length; i++) {

            if(value == binaryArray[i]){
                System.out.println("Value found");
                return;
            }
        }
        
    }

    public void traversal(int index){

        preOrderTraversal(index);
        postOrderTraversal(index);
        inOrderTraversal(index);

        levelOrderTraversal();
    }

    public void preOrderTraversal(int index){

        if(binaryArray == null){
            return;
        }else if(index >lastUsedIndex){
            return;
        }else{

            System.out.println(binaryArray[index]);
            preOrderTraversal(index*2);
            preOrderTraversal(index*2 +1);


        }

    }

    public void postOrderTraversal(int index){

        if(binaryArray == null){
            return;
        }else if(index >lastUsedIndex){
            return;
        }else{


            postOrderTraversal(index*2);
            postOrderTraversal(index*2 +1);
            System.out.println(binaryArray[index]);

        }

    }
    public void inOrderTraversal(int index){

        if(binaryArray == null){
            return;
        }else if(index >lastUsedIndex){
            return;
        }else{
            inOrderTraversal(index*2);
            System.out.println(binaryArray[index]);
            inOrderTraversal(index*2 +1);
        }

    }

    public void levelOrderTraversal(){

        for (int i = 0; i < binaryArray.length; i++) {

            System.out.println(binaryArray[i]);

        }



    }


    public void deleteNodeBinaryTree(int value){

        for (int i = 0; i < binaryArray.length; i++) {

            if(value == binaryArray[i]){

                binaryArray[i] = binaryArray[lastUsedIndex];

                lastUsedIndex --;

            }

        }

    }

    public void deleteBinaryTree(){

        binaryArray = null;

    }

}

