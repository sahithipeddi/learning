package com.learning.Basics.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/sahithipeddi/Documents/workspace/Learning/src/com/learning/example.txt");

        FileReader fr = new FileReader(file);



    }
}
