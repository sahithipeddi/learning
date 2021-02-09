package com.learning;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*
public class Test {

    public static void main(String[] args) {

        String parts = "SVC,BOX,Customer,REPARI/RETURN, WATCH";

        String parts1 = parts.replaceAll(",", "$0 ");

        System.out.println(parts1);

        String parts2 = parts1.replaceAll("\\s+", " ");

        System.out.println(parts2);

        int i =2;
        System.out.println(3/2);
        System.out.println(2/2 *2);

        System.out.println("---------------");

        Long test1 = 10l;
        Long test2 = 20l;

        ArrayList<Long> test = new ArrayList<>();

        test.add(test1);
        test.add(test2);

        System.out.println("Array List: " + test);

    }
}
*/


public class Test {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,1,0,0,1);

        Integer numberOfOperation = solve(input);

        System.out.println(numberOfOperation);
    }

    private static Integer solve(List<Integer> input) {

        Integer count = 1;

        Integer numberOfOperations = 0;

        for (int i = 0; i < input.size(); i++) {
//            System.out.println(i);

            if (count != 1) {
                numberOfOperations++;
                count++;
            }

            while (i < input.size()) {
                if (input.get(i) == 1) {
                    numberOfOperations++;
                } else {
                    break;
                }
                i++;
            }
        }

        return numberOfOperations;
    }
}
