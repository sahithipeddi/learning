package com.learning.Algorithms;

public class AtoiStringToInteger {
    public static void main(String[] args) {
//        String myString = "4193 with words";
//        String myString = "42";
        String myString = "";
        System.out.println(convertAtoiStringToInteger(myString));
    }
    public static int convertAtoiStringToInteger(String myString){
        int finalInt = 0;
        int sign = 1;
        int start = 0;
        int length = myString.length();
        long sum = 0;
        myString = myString.trim();
        if(myString == "") return 0;
        char firstChar = myString.charAt(0);
        if(firstChar == '+'){
            sign = 1;
            start ++;
        }else if(firstChar == '-'){
            sign = -1;
            start ++;
        }
        for (int i = start; i < myString.length(); i++) {
            if(!Character.isDigit(myString.charAt(i))) {
                return (int) sum * sign;
            }
            System.out.println(myString.charAt(i));
            sum = sum * 10 + myString.charAt(i) - '0' ;

            if(sign == -1 && (-1)*sum < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }else if(sign == 1 && sum > Integer.MAX_VALUE ){
                return Integer.MAX_VALUE;
            }

        }

        return (int)sum*sign;
    }
}
