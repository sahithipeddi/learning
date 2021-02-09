package com.learning.Basics.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileswithScanner{

    public static void main(String[] args) throws FileNotFoundException{

        String fileName = "/Users/sahithipeddi/Documents/workspace/Learning/src/com/learning/example.txt";
        File textFile = new File(fileName);

        Scanner in  = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read value: "+ value);

//        in.nextLine();

        int count = 2;

        while(in.hasNextLine()){
            String line = in.nextLine();

            System.out.println("Read Line " + line + " with Count: " + count);
            count++;

        }

        in.close();

    }
}
