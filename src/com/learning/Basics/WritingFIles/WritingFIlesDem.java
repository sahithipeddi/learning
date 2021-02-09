package com.learning.Basics.WritingFIles;

import java.io.*;
import java.io.FileWriter;

public class WritingFIlesDem {

    public static void main(String[] args) {

        File file = new File("/Users/sahithipeddi/Documents/workspace/Learning/src/com/learning/Basics/ReadingFiles/test.txt");

//        To append to existing file, Use FileWriter(FileName, append)

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file,true))) {

            br.write("Hello");

            br.newLine();

        } catch (IOException e) {
            System.out.println("Can't read file: " + e.toString());
        }

    }
}
