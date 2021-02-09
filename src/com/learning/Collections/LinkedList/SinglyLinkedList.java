package com.learning.Collections.LinkedList;

public class SinglyLinkedList {

    LinkedNode head;


    public void iteration(){
        LinkedNode n = head;
        while(n != null){
            System.out.println("Value is: " + n.value);
            n=n.next;
        }

    }

    public void addAtBeginniningOfList(Integer i){

        LinkedNode node5 = new LinkedNode(i);

        node5.next = head;

        head = node5;
    }

    private void addAtGivenNode(LinkedNode node3, int i) {

        LinkedNode node4 = new LinkedNode(i);

        node4.next = node3.next;

        node3.next = node4;

    }

   /* private void addEndNode(int i) {

        LinkedNode lastNode = new LinkedNode(i);

        while(n!=null){
            n = n.next;
        }

       n = lastNode;

    }
*/
    private void deleteNode(int i) {


        LinkedNode temp = head;
        LinkedNode prev = null;
        if( temp!=null && temp.value==i ){
                head = temp.next; // Changed head
                return;
            }

            // Search for the key to be deleted, keep track of the
            // previous node as we need to change temp.next
            while (temp != null && temp.value != i)
            {
                prev = temp;
                temp = temp.next;
            }

            // If key was not present in linked list
            if (temp == null) return;

            // Unlink the node from linked list
            prev.next = temp.next;
    }

    public static void main(String[] args) {

        SinglyLinkedList llist = new SinglyLinkedList();

        llist.head = new LinkedNode(1);

        LinkedNode node2 = new LinkedNode(2);

        LinkedNode node3 = new LinkedNode(3);

        llist.head.next = node2;

        node2.next = node3;

        llist.iteration();

       /* llist.addAtBeginniningOfList(5);

        llist.addAtGivenNode(node3, 4);

        llist.addEndNode(6);

        llist.deleteNode(5);*/

    }


    static class LinkedNode{

        LinkedNode next;
        Integer value;

        public LinkedNode(Integer i){
            this.value = i;
            next = null;
        }

    }
}
