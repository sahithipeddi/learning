package com.learning.Collections.Queues;


class QueueUsingLinkedListMain{

    private QNode front, rear;
    private int currentSize; //Number of items
    public QueueUsingLinkedListMain(){

    front = null;
    rear = null;
    currentSize = 0;

    }

    public boolean isEmpty()
    {
        return (currentSize == 0);
    }

    public void enqueue(int i) {

        QNode oldRear = new QNode();

        rear.data = i;

        rear.next = null;

        if(isEmpty()){

            front = rear;
        }

        else{
            oldRear.next = rear;
        }


        currentSize ++;

        System.out.println("data added in qu: "+i);


    }

    public void dequeue() {

        int data = front.data;

        front = front.next;

        if(isEmpty()){
            rear = null;
        }

        currentSize --;

        System.out.println("dequeed data: "+data);
    }
}



class Test{
    public static void main(String[] args){
        QueueUsingLinkedListMain queue = new QueueUsingLinkedListMain();

        queue.enqueue(6);

        queue.enqueue(9);

        queue.dequeue();
    }

}

class QNode{

    int data;
    QNode next;

}

