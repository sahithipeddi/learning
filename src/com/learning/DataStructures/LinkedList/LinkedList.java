package com.learning.DataStructures.LinkedList;

public class LinkedList {

    public Node head;

    public Node tail;

    public void append(Integer value) {

        if (head == null) {

            head = new Node(value);
            return;
        }

        Node current = head;

        while (current.next != null) {

            current = current.next;
        }

        Node node = new Node(value);

        current.next = node;

    }


    public void prepend(int data){
        Node node = new Node(data);

        node.next = head;
        head = node;
    }

    public void deleteValue(int data){

        if(head == null){
            return;
        }


        if(head.value == data) {
            head = null;
        }

        Node currentNode = head;

        while(currentNode.next!= null){

            if(currentNode.next.value == data){

                currentNode.next = currentNode.next.next;

                return;

            }

            currentNode = currentNode.next;
        }

    }


    public boolean hasCycle(Node head){

        Node slowLoop = head;

        if(slowLoop == null){
            return false;
        }

        Node fastLoop = head.next;
        while(slowLoop.next!= fastLoop){
            if(fastLoop == null || fastLoop.next == null){
                return false;
            }
            slowLoop = slowLoop.next;
            fastLoop = fastLoop.next.next;
        }

        return true;

    }

}

class LinkedListTest{

    public static void main(String[] args) {

        LinkedList myLL = new LinkedList();

        myLL.append(12);

        myLL.append(34);


        System.out.println();

    }

}
