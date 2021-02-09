package com.learning.Basics.ReadingFiles;

import java.io.*;
import java.util.Scanner;

public class ReadingFiles {

    public static void main(String[] args) {

        File file = new File("/Users/sahithipeddi/Documents/workspace/Learning/src/com/learning/Basics/ReadingFiles/test.txt");

        BufferedReader br = null;


        try {
            FileReader fr = new FileReader(file);

            /*
             * Buffer Reader will help to read text from characters-input stream, buffering characters as to provide for the efficient reading of char
             *
             * */


//            BufferedReader br = new BufferedReader(fr);

            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

//            br.close();


        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + e.toString());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            } catch (NullPointerException e) {

            }
        }
    }


}

