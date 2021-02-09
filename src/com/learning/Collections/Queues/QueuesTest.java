package com.learning.Collections.Queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuesTest {

    public static void main(String[] args) {
        /* (Head) <-oooooooooooooo <- (tail)
         *
          * Items will leave at the end of qu
          *
          * items will add at the end of qu
          *
          * qu - FIFO -- First item you add will be first to remove
          *
          * qu's can have max size to it. They can be endless
          *
          * 2 seperate sets of methods of implementing it.
          *
          * add(e)
          *
          * Array Blocking Q is a bounded q, Where as if you need a unbounded q use a linked list
          *
          * */

        Queue<Integer> q1 = new ArrayBlockingQueue <Integer>(3);

        q1.add(10);
        q1.add(11);
        q1.add(12);

        try{
            q1.add(12);
        }catch (IllegalStateException e){
            System.out.println("Try to add too many items to the qu");
        }

        for(Integer value: q1){
            System.out.println("Qu value: " + value);
        }

        q1.remove();
        q1.remove();
        q1.remove();

        try {
            q1.remove();
        } catch (NoSuchElementException e){
            System.out.println("NO Such element exception");
        }


//        /////////// Offer just return true or false it doesn't throw exception and Poll is used to remove the item. Usually it returns null if there's no items left in q to remove
// Peek returns first value in q
//
        Queue<Integer> q2 = new ArrayBlockingQueue <Integer>(3);

        System.out.println("peek is: "+q2.peek());

        q2.offer(10);
        q2.offer(11);
        q2.offer(14);

        System.out.println("peek is: "+q2.peek());

        if (! q2.offer(18)) {
            System.out.println("Offer failed to add fourth items");
        }
        q2.offer(19);

        for(Integer value: q2){
            System.out.println("q2 value is: " + value);
        }


        System.out.println(q2.poll());
        System.out.println(q2.poll());
        System.out.println(q2.poll());
        System.out.println(q2.poll());

    }
}
