package com.learning.Collections.LinkedList;

import java.util.LinkedList;

public class LoopSinglyLinkedList {


    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        /*Loop in LL*/
        head.next.next.next.next.next = head.next;

        System.out.println(countNodesinLoop(head));

        reverseBetween(head,2,4);

        reverseBetween(head);

    }

    private static void reverseBetween(Node head) {






    }

    private static void reverseBetween(Node head, int i, int i1) {



    }

    static int countNodes( Node n)
    {
        int res = 1;
        Node temp = n;
        while (temp.next != n)
        {
            res++;
            temp = temp.next;
        }
        return res;
    }

    static int countNodesinLoop( Node list)
    {
        Node slow_p = list, fast_p = list;

        while (slow_p !=null && fast_p!=null && fast_p.next!=null)
        {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;

        /* If slow_p and fast_p meet at some point
        then there is a loop */
            if (slow_p == fast_p)
                return countNodes(slow_p);
        }

        /* Return 0 to indeciate that ther is no loop*/
        return 0;
    }
}

class Node{

    Node next;
    int value;

    public Node(int i){

        this.value= i;
        next= null;
    }

}