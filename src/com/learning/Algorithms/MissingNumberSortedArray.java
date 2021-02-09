package com.learning.Algorithms;

    // A binary search based program
// to find the only missing number
// in a sorted array of distinct
// elements within limited range.
import java.io.*;

    class GFG {
        static int search(int array[], int start , int end) {

            if(end<=start+1){
                return start+1;
            }
            else{

                int mid = start + (end-start)/2;

                if((array[mid] - array[start]) != (mid-start))
                    return search(array, start, mid);
                else if((array[mid]-array[start] == array[end]-array[mid+1])){

                    return mid+1;
                }
                else {
                    return search(array, mid+1, end);
                }

            }
        }

        // Driver Code
        public static void main(String[] args) {
            int ar[] = {20,21,23,24,25,26};
            int size = ar.length;
            System.out.println("Missing number: " +
                    search(ar, 0,(size-1)));
        }
    }
