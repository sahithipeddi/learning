package com.learning.DataStructures.Queue;

public class QueueWithLinkedList<T> {

    public class Node<T>{
        Node<T> next;
        T data;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public boolean isEmpty(){
        return (head == null);
    };
    public T peek(){
        return head.data;
    };
    public void add(T data){

        Node<T> newNode = new Node<>( data);

        if(tail != null){
            tail.next = newNode;
        }
        tail = newNode;

        if(head == null){

            head = newNode;
        }
    };

    public T remove() {

        T data = head.data;

        head = head.next;

        if (head == null) {
            tail = null;
        }
        return data;
    };

}