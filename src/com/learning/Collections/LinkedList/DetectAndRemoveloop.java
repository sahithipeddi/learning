package com.learning.Collections.LinkedList;

public class DetectAndRemoveloop {
    {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        /*Loop in LL*/
        head.next.next.next.next.next = head.next;

        System.out.println(DetectAndRemoveloop(head));

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

    static int DetectAndRemoveloop( Node list)
    {
        Node slow_p = list, fast_p = list;

        while (slow_p !=null && fast_p!=null && fast_p.next!=null)
        {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;

        /* If slow_p and fast_p meet at some point
        then there is a loop */
            if (slow_p == fast_p)
                removeloop(slow_p,list);
        }

        /* Return 0 to indeciate that ther is no loop*/
        return 0;
    }

    private static void removeloop(Node slow_p, Node list) {




    }
}
