package com.learning.Algorithms;

public class FindMissingNumberSortedArray {
    public static void main(String[] args) {
        int ar[] = {20,21,23,24,25,26};
        int size = ar.length;
        System.out.println("Missing number: " +
                search(ar, 0,(size-1)));
    }

    private static int search(int array[], int start , int end) {

        if(end<=start+1){
            return start+1;
        }
        else{

            int mid = start + (end-start)/2;

            if((array[mid] - array[start]) != (mid-start))
                return search(array, start, mid);
            else if((array[end] - array[mid+1]) != (end - (mid+1))) {
                return search(array, mid+1, end);
            }else {
                return mid+1;
            }

        }
    }
}
