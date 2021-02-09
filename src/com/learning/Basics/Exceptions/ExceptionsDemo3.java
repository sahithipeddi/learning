package com.learning.Basics.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo3 {



    public static void main(String[] args) {

        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.toString());
        }

    }

    public static void openFile() throws FileNotFoundException {

            File file = new File("/Users/sahithipeddi/Documents/workspace/Learning/src/com/learning/Basics/Exceptions/test1");

            FileReader fr = new FileReader(file);

//            This will not be executed if exception is thrown.

            System.out.println("Continuing ...");
        }

}
