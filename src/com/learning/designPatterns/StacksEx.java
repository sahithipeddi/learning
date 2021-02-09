package com.learning.designPatterns;

import java.util.ArrayList;
import java.util.Stack;

public class StacksEx {

    public static void main(String[] args) {


        StackLogic stack = new StackLogic();

        stack.push(8);

        stack.push(10);

        stack.pop();

    }

}

class StackLogic{

    private SNode top;

    public StackLogic(){
        top = null;
    }


    public void push(int data) {

    SNode temp = top;

    top = new SNode();

    if(temp == null){
        System.out.println("StackOverfloe");
        return;
    }

    top.data = data;

    top.next = temp;

    System.out.println("Added into stack: "+data);


    }

    public void pop(){

        if(top == null){
            System.out.println("Stack Uderflow");
            return;
        }
        System.out.println("Removed data from stack: " + top.data);
        top = top.next;

    }
}

class SNode{

    int data;
    SNode next;

}