package com.learning.designPatterns;


import java.util.Stack;

public class QwithStack {
    public static void main(String[] args) {


        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue("Hi");

        queue.enqueue("Hello");

//        queue.displayAll();

        queue.dequeue();

        queue.enqueue(30);

        queue.enqueue(40);

        queue.dequeue();

        queue.displayAll();
    }

}

class StackImple<T>{

    private QwithStackNode<T> top;

    public StackImple(){
        top = null;
    }

    public boolean isEmpty(){

        return (top==null);
    }

    public void display(){

        if(top == null){
            System.out.println("No items to display in Stack");
            return;
        }

        else{

            QwithStackNode<T> temp = top;

            while(temp != null){

                System.out.print(" "+temp.data);

                temp = temp.next;

            }

        }

    }


    public void push(T data) {

        QwithStackNode<T> temp = new QwithStackNode<T>();

        if(temp == null){
            System.out.println("StackOverfloe");
            return;
        }

        temp.data = data;

        temp.next = top;

//        System.out.println("Added into stack: "+data);

        top = temp;
    }

    public T pop(){

        if(top == null){
            System.out.println("Stack Underflow");
            return null;
        }
//        System.out.println("Removed data from stack: " + top.data);

        T valueOfTop = top.data;

        top = top.next;

        return valueOfTop;

    }
}

class QwithStackNode<T>{

    T data;
    QwithStackNode<T> next;

}

class QueueUsingStack<T>{


    StackImple stack1 = new StackImple();

    StackImple stack2 = new StackImple();

    public void enqueue(T i) {

        stack1.push(i);
    }


    public void dequeue() {

        if(stack2.isEmpty()){
        while(!stack1.isEmpty()){

         stack2.push(stack1.pop());

             }
        }

        stack2.pop();

    }


    public void displayAll() {

        System.out.println("Elements in Queue ");

        System.out.println("Elements in Stack1 are: ");

        stack1.display();
        System.out.println();
        System.out.println("Elements in Stack2 are: ");
        stack2.display();

    }
}
