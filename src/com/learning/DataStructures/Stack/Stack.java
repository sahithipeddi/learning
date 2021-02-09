package com.learning.DataStructures.Stack;

public class Stack<T> {

    public class Node<T>{
        Node<T> next;
        T data;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public boolean empty(){
        return (top == null);
    };
    public T peek(){
        return top.data;
    };
    public void push(T data){
        Node<T> newNode = new Node <>(data);
        if(top != null){
            newNode.next = top;
            top = newNode;
        }

    };
    public T pop(){
        T data = top.data;

        top = top.next;

        return data;
    };

}

