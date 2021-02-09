package com.learning.DataStructures.Queue;

public class QueueCircularArrayImplementation {

    int[] array;

    int start = -1;

    int tail = -1;

    int data;

    public QueueCircularArrayImplementation(int data, int size){

        array = new int[size];

        this.data = data;

    }


    public boolean isQEmpty(){


        if(tail == -1){

            return true;
        }

        return false;

    }


    public boolean isQFull(){

        if(tail +1 == start){
            return true;
        }
        else if(start == 0 && (tail +1== array.length) ){
            return true;
        }

        return false;
    }

    public void enqueue(int data){

        if(isQEmpty()){
            start ++;
            tail++;

            array[start] = data;
            return;
        }
        else if(isQFull()){
            return;
        }
        else if(tail + 1 == array.length){

            tail = 0;
            array[tail] = data;
        }

        else {

            tail ++;

            array[tail] = data;

        }



    }


    public void deQueue(){

        if(isQEmpty()){
            return;
        }else if (start == tail){

            start = tail = -1;

        }
        else if (start+1 == array.length){
            start = 0;
        }else {
            start++;
        }


    }



}
