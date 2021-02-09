package com.learning.Basics;

public class StringBuilderandFormattertutorial {

    public static void main(String[] args) {


        /*
        * In java Strings are immutable. Info is going to be empty for rest of it's life in the program. We're reassigning info and creating new string.
        *   It is in efficient and could slow down our program.
        *
        * */

        String info = "";

        info = "my name is sri";

        info += " ";

        info += "I'm a builder";

        System.out.println(info);

        /*More efficient. More memory efficient way of appending text.*/

        StringBuilder sb = new StringBuilder("");

        sb.append("my Name is Sahi");
        sb.append(" ");
        sb.append("I'm a lion tamer");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is program")
         .append(" ")
                .append("I'm a sky diver");

        System.out.println(s.toString());

//        Formatting /////////////////////////////////////////////////////

        System.out.println("here is some text.\t That was a table. \n That was a new Line");

        System.out.println("More text");

//        Fotmatting Integers

        System.out.printf("Total cost %-5d; quantity is %5d\n", 5, 120);


//        Fotmatting Int and Strings

        for(int i=0;i<20;i++) {
            System.out.printf("%-2d: %s\n", i, "Some text here");
        }

            //        Fotmatting floating point -- 7 in 7.2 is number of characters. if it's -7 It would print 5.62     With 7 characters to the right.


        System.out.printf("Total value %-7.2f \n", 5.6245);

    }


}
