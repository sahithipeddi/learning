package com.learning.Algorithms.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        String paranthesis = "()";

        System.out.println(isValid(paranthesis));


    }

    public static boolean isValid(String s){
        boolean isValid = false;

        Map<Character, Character> paranthesisMap = new HashMap<Character, Character>();

        paranthesisMap.put(']', '[');
        paranthesisMap.put('}', '{');
        paranthesisMap.put(')', '(');

        Stack myStack = new Stack();

        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);

            if(paranthesisMap.containsKey(c)) {
                char stackChar = myStack.empty() ? '#' : (char) myStack.pop();

                if (stackChar != paranthesisMap.get(c)){
                    return false;
                }
            } else {
                myStack.push(c);
            }
        }

        return myStack.empty();
    }
}
