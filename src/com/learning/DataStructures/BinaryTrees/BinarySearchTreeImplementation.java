package com.learning.DataStructures.BinaryTrees;

import com.learning.DataStructures.Queue.QueueWithLinkedList;

import javax.swing.tree.TreeNode;
import java.net.BindException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTreeImplementation {

    public BinaryNode root;

    public BinarySearchTreeImplementation(){
        this.root = null;
    }


    public void insert(int value){

        root = insertNode(root, value);
    }


    public BinaryNode insertNode(BinaryNode currentNode, int value){

        if(currentNode == null){
            BinaryNode newNode = new BinaryNode();

            newNode.value = value;
            System.out.println("New Node inserted "+ newNode.getValue());
            return newNode;
        }

        else if(currentNode.value > value){
            currentNode.setLeft(insertNode(currentNode.getLeft(), value));
            return currentNode;
        }else {
            currentNode.setRight(insertNode(currentNode.getRight(), value));
            return currentNode;
        }
    }



    void search(int value){

        seachValue(root, value);
    }

    BinaryNode seachValue(BinaryNode node, Integer value){

        if(node == null){
            return null;
        }
        else if(node.value == value){
            System.out.println("Value found in node: " +node.getValue());
            return node;
        }else if(value < node.getValue() ){

          return seachValue(node.getLeft(), value);

        }else
            return seachValue(node.getRight(), value);
    }


    void levelOrderTraversal() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        System.out.println("\nPrinting Level order traversal of Tree...");
        if (root == null) {
            System.out.println("Tree does not exists !");
            return;
        }
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.getValue() + " ");
            if (presentNode.getLeft() != null)
                queue.add(presentNode.getLeft());
            if (presentNode.getRight() != null)
                queue.add(presentNode.getRight());
        }
    }// end of method


    public void deleteNodeValue(int value){

        deleteNode(root, value);
    }

    BinaryNode deleteNode(BinaryNode root, int value){

        if(root == null){
            System.out.println("Tree is not present");
            return null;
        }else if(root.value > value){
            BinaryNode binaryNode1 = deleteNode(root.getLeft(), value);

            root.setLeft(binaryNode1);

        }else if(root.value < value){
            root.setRight(deleteNode(root.getRight(), value));
        }else if(root.value == value){

            if(root.getLeft()!=null && root.getRight() != null){
                BinaryNode temp = root;

                BinaryNode minimumNode = findSuccesor(temp.getRight());
                root.setValue(minimumNode.getValue());
                root.setRight(deleteNode(root.getRight(), minimumNode.getValue()));
            }else if(root.getLeft() != null){
                root = root.getLeft();
            }else if(root.getRight() != null){
                root = root.getRight();
            }else
                root = null;

        }

        return root;

    }

    private BinaryNode findSuccesor(BinaryNode node){
        if(node.getLeft() == null){
            System.out.println(node.getValue());
            return node;
        }else {
            return findSuccesor(node.left);
        }
    }




}
