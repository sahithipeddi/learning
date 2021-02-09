package com.learning.Algorithms;

import java.util.HashSet;
import java.util.Set;

public class UniqueStringSet {
    public static void main(String[] args){
        String str = "teststrDup";
        Set strList = new HashSet();

        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            strList.add(String.valueOf(ch));
        }

        System.out.println(strList);
    }
}
