package com.learning.DataStructures.BinaryTrees;

public class BinarSearchMain {

    public static void main(String[] args) {
        //Constructor
        BinarySearchTreeImplementation tree = new BinarySearchTreeImplementation();

        //Inserting values in BST
        System.out.println("Inserting 10 nodes in Tree");
        tree.insert(100);
        tree.insert(80);
        tree.insert(70);
        tree.insert(90);
        tree.insert(65);
        tree.insert(75);
        /*tree.insert(50);
        tree.insert(150);
        tree.insert(200);
        tree.insert(170);*/

        tree.levelOrderTraversal();

        tree.deleteNodeValue(70);

        tree.levelOrderTraversal();
    }


}
