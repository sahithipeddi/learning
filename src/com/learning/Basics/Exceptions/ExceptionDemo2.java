package com.learning.Basics.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo2 {

    public static void main(String[] args){

        File file = new File("/Users/sahithipeddi/Documents/workspace/Learning/src/com/learning/Basics/Exceptions/tests");

        try {
            FileReader fr = new FileReader(file);

//            This will not be executed if exception is thrown.

            System.out.println("Continuing ...");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+ file.toString());
        }

        System.out.println("Finished.");

    }

}
