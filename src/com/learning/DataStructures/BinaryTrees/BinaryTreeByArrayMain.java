package com.learning.DataStructures.BinaryTrees;

public class BinaryTreeByArrayMain {



    public static void main(String[] args) {


        //Create a blank array to store Binary Tree
        System.out.println("Creating a blank Array to store Binary Tree...");
        BinaryArrayImplementation tree = new BinaryArrayImplementation(10);


        //Insert 10 values in the tree
        System.out.println("Inserting 10 values in the Tree...");
        for(int i=1; i<=10; i++){
            tree.insert(i*10);
        }


        //Level order Traverse
        System.out.println("\nLevel-order Traversal:");
        tree.levelOrderTraversal();


       /* //Pre order Traverse
        System.out.println("\n\nPre-order Traversal:");
        tree.preOrderTraversal(1);


        //Post order Traverse
        System.out.println("\n\nPost-order Traversal:");
        tree.postOrderTraversal(1);

        //In order Traverse
        System.out.println("\n\nIn-order Traversal:");
        tree.inOrderTraversal(1);


        //Search for value in Tree
        System.out.println("\n\nSearching value 500 in the tree...");
        tree.search(500);


        //Search for value in Tree
        System.out.println("Searching value 40 in the tree...");
        tree.search(40);


        //Delete value from Tree
        System.out.println("\nDeleting node 500 from the tree...");
        tree.deleteNodeBinaryTree(500);


        //Delete value from Tree
        System.out.println("Deleting node 40 from the tree...");
        tree.deleteNodeBinaryTree(40);


        //Level order Traverse
        System.out.println("\nLevel-order Traversal:");
        tree.levelOrderTraversal();


        //Delete the entire Tree
        System.out.println("\n\nDeleting the entire Tree...");
        tree.deleteBinaryTree();*/

    }


}
