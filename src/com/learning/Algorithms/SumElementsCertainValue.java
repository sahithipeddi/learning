package com.learning.Algorithms;


import java.util.*;

public class SumElementsCertainValue {

    public static void main(String[] args) {

        int[] myList = enterInput();

        System.out.println("Enter sum value: ");

        Scanner inputSum = new Scanner(System.in);

        int sum = inputSum.nextInt();

        System.out.println("Sum value is: "+sum);

//        Collections.sort(myList);

//        showElements(myList);

        findTwoElements(myList, sum);
    }

    private static void findTwoElements(int[] myList, int sum) {

        if(myList.length < 2){
            return;
        }
        Set set = new HashSet(myList.length);

        List list = new ArrayList(myList.length);

        for(int value: myList){
            list.add(value);
        }

        for(int value : myList){
            int target = sum - value;

            // if target number is not in set then add
//            if(!set.contains(target)){
            if(list.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }

    }

    private static void showElements(List<Integer> list) {

        System.out.println("Array List Numbers: ");

        for (int number:
                list) {
            System.out.print(" "+number);
        }
    }

    private static int[] enterInput(){

        System.out.println("Enter values: ");
        Scanner scanner = new Scanner(System.in);
        int[] mylist = new int[9];

        for(int i=0 ; i < 9 ; i++){
            mylist[i] = scanner.nextInt();
        }

        return mylist;
    }

}
