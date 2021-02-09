package com.learning.DataStructures.BinaryTrees;

public class BinaryHeap {

    int[] heap;
    int heapSize;

    public BinaryHeap(int size) {

         heap = new int[size+1];
         heapSize = 0;

    }

    public int peek(){

        if(heap == null){
            return -1;
        }
        else {
            return heap[1];
        }
    }

    public int sizeofHeap(){
        return heapSize;
    }

    public void insert(int value){

        heap[heapSize +1] = value;

        heapSize++;

        heapifyBottomtoTop(heapSize);

    }

    private void heapifyBottomtoTop(int index){
        int parentNodeIndex = index/2;

        if(parentNodeIndex < 1){
            return;
        }else if(parentNodeIndex == 1 ){
            if(heap[index] < heap[parentNodeIndex]) {
                int temp = heap[index];
                heap[index] = heap[parentNodeIndex];
                heap[parentNodeIndex] = temp;
            }
            return;
        }
        if(heap[index] < heap[parentNodeIndex] ){

            int temp = heap[parentNodeIndex];

            heap[parentNodeIndex] = heap[index];

            heap[index] = temp;

        }
        heapifyBottomtoTop(parentNodeIndex);
    }

    public int extractElement() {

        if (heapSize == 0) {
            return -1;
        } else {
            int extractedElement = heap[1];
            heap[1] = heap[heapSize];
            heapSize--;
            heapifyToptoBottom(1);
            return extractedElement;
        }

    }

    private void heapifyToptoBottom(int index){

        int leftIndex = index*2;
        int rightIndex = index*2 +1;
        int smallestChild;

        if(heapSize < leftIndex){
            return;
        }else if(heapSize == leftIndex){

            if(heap[index] > heap[leftIndex]) {
                int temp = heap[index];
                heap[index] = heap[leftIndex];
                heap[leftIndex] = temp;
            }
            return;
        }else {
            if(heap[leftIndex] < heap[rightIndex]){

                smallestChild = leftIndex;

            }
            else
                smallestChild = rightIndex;


            if(heap[index] > heap[smallestChild]){

                int temp = heap[index];
                heap[index] = heap[smallestChild];
                heap[smallestChild] = temp;

            }
            heapifyToptoBottom(smallestChild);
        }


    }

    public void levelOrderTraversal(){

        for (int i = 0; i < heap.length-1 ; i++) {

            System.out.println(heap[i]);

        }

    }

}
