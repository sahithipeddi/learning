package com.learning.Recursion;

public class Fibonocci {

    public static void main(String[] args) {
        int n = 11;
        System.out.println(findFibonocci(n));
    }

    private static int findFibonocci(int n){

        if(n<1){
            return 0;
        }
        else if (n ==1  || n == 2){

            return n-1;

        }
        else

          return findFibonocci(n-1) + findFibonocci(n-2);

    }
}
