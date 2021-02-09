package com.learning.Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class FindBalancedExpression {

    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String input = s.nextLine();
        System.out.println(findIfExpressionStringIsBalanced(input));

    }

    private static boolean findIfExpressionStringIsBalanced(String value) {

        HashMap map = new HashMap();
        Stack stack = new Stack();


        map.put("}", "{");
        map.put("]", "[");
        map.put(")", "(");


        for (int i = 0; i <= value.length(); i++) {

            Character character = value.charAt(i);
            if (character.equals('{') || character.equals('[') || character.equals('(')) {
                stack.push(character);
            } else if (character.equals(']') || character.equals('}') || character.equals(')')) {

                if(stack.isEmpty()){
                    return false;
                }
                else if(character != map.get(stack.pop())) {
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        else
            return false;

    }
}

class Stack{

    SNode top;

    public Stack(){
        top=null;
    }

    public void push(Character character) {

        SNode temp = new SNode();

        temp.data = character;

        temp.next = top;

        top = temp;

    }

    public Character pop(){

        if(isEmpty()){
            return 'E';
        }

        Character topData = top.data;

        top = top.next ;

        return topData;
    }

    public boolean isEmpty() {

        return top== null;

    }
}

class SNode{

    Character data;
    SNode next;

}
