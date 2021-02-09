package com.learning.Algorithms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstUniqChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String value = input.next();


        findUniqCharater(value);
    }

    private static void findUniqCharater(String value) {

        Set set = new LinkedHashSet();

        for(int i = 0; i< value.length(); i++){

            Character character = value.charAt(i);

            if(!set.contains(character)){
                System.out.println("Uniq char is: "+character);
            }

            set.add(character);
        }
    }
}
