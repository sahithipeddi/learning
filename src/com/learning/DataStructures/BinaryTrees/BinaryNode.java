package com.learning.DataStructures.BinaryTrees;

public class BinaryNode {

    public BinaryNode next;

    public int value;

    public BinaryNode left;

    public BinaryNode right;

    /*public BinaryNode(int value){
        this.value = value;
    }*/


    public BinaryNode getNext() {
        return next;
    }

    public void setNext(BinaryNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
