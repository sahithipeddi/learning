package com.learning.Algorithms;

public class ReverseInteger {

    public static void main(String[] args) {
        int myInteger = -1463847412;
        System.out.println(reverseInteger(myInteger));
    }

    public static int reverseInteger(int myInt){
        int reverse =0;
        int temp;
        int pop;
        while(myInt!= 0){
            pop = myInt%10;
            myInt /= 10;

            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            else if(reverse< Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && pop < -8))return 0;

            temp = reverse*10 + pop;
            reverse = temp;
        }

        return reverse;
    }

}
