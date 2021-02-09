package com.learning.DataStructures.BinaryTrees;

import com.learning.DataStructures.Queue.QueueWithLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryLinkedList {

    public BinaryNode root;

    public BinaryLinkedList() {
        this.root = null;
    }


    public void insert(int value){

        BinaryNode node = new BinaryNode();
        node.setValue(value);

        if(root == null){
            root = node;
            System.out.println("Successfully inserted new node at Root !");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList <BinaryNode>();

        queue.add(root);

        while(!queue.isEmpty()){

            BinaryNode presentNode = queue.remove();

            if (presentNode.getLeft() == null){

                presentNode.setLeft(node);

                return;

            }
            else if(presentNode.right == null){

                presentNode.setRight(node);

                return;

            } else {
                queue.add(presentNode.getLeft());
                queue.add(presentNode.getRight());
            }

        }

    }

    public void deleteValue(int value){

        BinaryNode node = search(value);
        if(node != null){
            DeleteDeepestNode();

        }else {
            return;
        }

    }

    private void DeleteDeepestNode() {

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();

        queue.add(root);

        BinaryNode presentNode = null, previousNode = null;

        while (!queue.isEmpty()){
            previousNode = presentNode;

            presentNode = queue.remove();

            if (presentNode.getLeft() == null){

                previousNode.setRight(null);

                return;
            }else if (presentNode.getRight() == null){

                presentNode.setLeft(null);

                return;

            }

            queue.add(presentNode.getLeft());
            queue.add(presentNode.getRight());


        }

    }

    public void DeleteBinarytree(){
        root = null;
    }


    public BinaryNode search(int value) {

        Queue <BinaryNode> queue = new LinkedList <BinaryNode>();

        queue.add(root);

        while (!queue.isEmpty()){

            BinaryNode presentNode = queue.remove();

            if(presentNode.getValue() == value){

                System.out.println("Value present in Queue");
                return presentNode;
            }
            else {
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                else if(presentNode.right != null){
                    queue.add(presentNode.right);
                }

            }

        }

        System.out.println("Value not found in Tree");

        return null;
    }

    public void traversal(BinaryNode node){

        inorderTraversal(node);

        preorderTraversal(node);

        postorderTraversal(node);

    }


    public void inorderTraversal(BinaryNode node){

        if(node == null){
            return;
        }

        inorderTraversal(node.left);
        System.out.println(node.getValue());
        inorderTraversal(node.right);

    }

    public void preorderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.println(node.getValue());
        preorderTraversal(node.getLeft());
        preorderTraversal(node.getRight());
    }

    public void postorderTraversal(BinaryNode node){

        if(node == null){
            return;
        }
        preorderTraversal(node.getLeft());
        preorderTraversal(node.getRight());
        System.out.println(node.getValue());
    }

}
