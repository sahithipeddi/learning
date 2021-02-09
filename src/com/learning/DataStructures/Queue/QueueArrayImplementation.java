package com.learning.DataStructures.Queue;

import java.util.Queue;

public class QueueArrayImplementation {

    int[] myQueue;

    int front = -1;

    int tail = -1;

    public QueueArrayImplementation(int size){

        myQueue = new int[size];

    }

    public void enqueue(int data){

        if(front == -1){

            front ++;

            tail ++;

            myQueue[tail] = data;

        }
        else{
            tail ++;
            myQueue[tail] = data;
            System.out.println("\nSuccessfully inserted "+data+" in the queue");
        }

        System.out.println("\nSuccessfully inserted "+data+" in the queue");

    }

    public void dequeue(){

        if(front == -1){
            return;
        }
        else{
            front = front+1;
            if(front > tail){
                front = tail = -1;
            }
        }

    }

    public boolean isQEmpty(){


        if(front == -1){
            return true;
        }

        return false;
    }

    public boolean isQFull(){

        if (tail+1 == myQueue.length){
            return true;
        }

        return false;

    }

}
