package com.learning.Algorithms;

import java.util.HashSet;
import java.util.Scanner;

public class FindFirstNoUniqCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String value = input.next();


        findUniqCharater(value);
        

    }

    private static void findUniqCharater(String value) {

        HashSet set = new HashSet();

        for(int i = 0; i< value.length(); i++){

            Character character = value.charAt(i);

            if(set.contains(character)){
                System.out.println("Non- Uniq char is: "+character);
            }

            set.add(character);
        }
    }
}
