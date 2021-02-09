package com.learning.Basics.Exceptions.RunTimeExceptions;

/*There are few exceptions in Java which are to be handled during RUN Time. These are called RUN TIME Exceptions
 *
  * They Don't force you to handle them. If you get one in the program, There's something wrong with it which should have been addressed.
  * */
public class RuntimeExceptionDemo {

    public static void main(String[] args) {

        int value = 7;

//        value = 7/0;

        String text = null;

//        text.length();

        String[] texts = {"one", "two", "theree"};

        try {
            System.out.println(texts[3]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println(e.toString());
        }



    }
}
