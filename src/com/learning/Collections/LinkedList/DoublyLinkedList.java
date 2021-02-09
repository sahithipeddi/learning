package com.learning.Collections.LinkedList;

import javax.print.DocFlavor;
import java.util.Stack;

public class DoublyLinkedList {

    Node head;

    class Node{

        Node next;
        Node prev;
        int data;

        Node(int d){
            this.data=d;
        }

    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        Node node1 = list.push(3);
        list.push(4);
        list.push(2);

//        list.pushAtGivenNode(node2,50);

//        list.append(60);
//        list.traversal(list.head);
//        list.reverseLinkedList(list.head);
       DoublyLinkedList list2 = new DoublyLinkedList();

        Node node2 = list2.push(4);
        list2.push(6);
        list2.push(5);

        add(list.head, list2.head);
    }

    private static void add(Node node1, Node node2){

        DoublyLinkedList list3 = new DoublyLinkedList();

        Integer carry = 0;

       while((node1!=null) && (node2!=null)){

           Integer sum = node1.data+node2.data+carry;
            System.out.println("Value is: " +sum);
            node1 = node1.next;
            node2 = node2.next;

            Integer nextValue;

            String sumValue = sum.toString();

            if(sumValue.length()>1) {

                nextValue = sum % 10;

                System.out.println("Next Value is: "+nextValue);
                list3.push(nextValue);
                carry = sum / 10;
                }else
           list3.push(sum);
            }
        System.out.println("List 3 traverse");
        list3.traversal(list3.head);
        }




    private void reverseLinkedList(Node node){

        Node last = null;

        Node fastPointer;

        System.out.println("Reversal");
        while((node != null)){
//            System.out.println(node.data);
            last = node;
//            System.out.println(last);
            node = node.next;
        }

        while (last != null){

            System.out.println(last.data);

            last = last.prev;

        }
    }

    private void traversal(Node node){
        {
            Node last = null;
            System.out.println("Traversal in forward Direction");
            while (node != null) {
                System.out.print(node.data + " ");
                last = node;
                node = node.next;
            }
            System.out.println();
            System.out.println("Traversal in reverse direction");
            while (last != null) {
                System.out.print(last.data + " ");
                last = last.prev;
            }
        }
    }

    private void pushAtGivenNode(Node i, int i1) {
        if(i == null){
            System.out.println("previous node is null");
            return;
        }

        Node new_Node = new Node(i1);

        new_Node.prev = i;

        new_Node.next = i.next;

        i.next = new_Node;

        new_Node.next.prev = new_Node;

    }

    private Node push(int data) {


        Node new_Node = new Node(data);

        new_Node.next = head;
        new_Node.prev = null;

        if(head!=null){
            head.prev = new_Node;
        }

        head = new_Node;

        return head;

    }

    // Add a node at the end of the list
    void append(int new_data)
    {
        /* 1. allocate node
         * 2. put in the data */
        Node new_node = new Node(new_data);

        Node last = head; /* used in step 5*/

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.prev = last;
    }


}
