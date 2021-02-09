package com.learning.Algorithms;

import com.learning.DataStructures.LinkedList.LinkedList;

import java.util.List;

/*You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order and each of their nodes contain a single
 digit. Add the two numbers and return it as a linked list.*/
public class AddTwoNumbers {

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.append(2);
        l1.append(4);
        l1.append(3);

        l2.append(5);
        l2.append(6);
        l2.append(4);

        int[] l1array= new int[]{2,4,3};

        ListNode myl1 = new ListNode(0);
        ListNode currentNode = myl1;
        for (int i:
             l1array) {
            currentNode.next = new ListNode(i);
            currentNode = currentNode.next;
        }

        int[] l2array= new int[]{5,6,4};
        ListNode myl2 = new ListNode(0);
        ListNode currentNode1 = myl2;
        for (int i:
             l2array) {
            currentNode1.next = new ListNode(i);
            currentNode1 = currentNode1.next;
        }

        ListNode linkedList = addTwoNumbers(myl1, myl2);

        /*LinkedList linkedList = addTwoNumbers(l1, l2);

        while (linkedList.head != null ){
            System.out.println(linkedList.head.value);
            linkedList.head = linkedList.head.next;
        }*/



    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;
        int carry = 0;
        while(l1 != null || l2 != null){
            int value1 = (l1 !=null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;

            int sum = value1 + value2 + carry;

            carry = sum /10;
            int lastdigit = sum %10;

            ListNode newNode = new ListNode(lastdigit);
            l3.next = newNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }

        if(carry>0){
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
        }

        return dummyHead.next;


    }

    }

    /*public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {

        int overspill = 0;
        LinkedList finalList = new LinkedList();

        while(l1.head != null & l2.head != null){

            int i = l1.head.value + l2.head.value + overspill;
//            l1.

            if(i/10 > 0){
                overspill = i/10;
                int tens = i%10;
                finalList.append(tens);
            }
            else {
                finalList.append(i);
            }

            l1.head = l1.head.next;
            l2.head = l2.head.next;


        }
        return finalList;
    }*/




    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }



