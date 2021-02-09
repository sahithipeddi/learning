package com.learning.Basics.ReadingFiles;

import java.io.*;

public class TrywithResour2 {

    public static void main(String[] args) {

        File file = new File("/Users/sahithipeddi/Documents/workspace/Learning/src/com/learning/Basics/ReadingFiles/test.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {

            System.out.println("Can't find file: " + e.toString());

        } catch (IOException e) {
            System.out.println("Can't read file: " + e.toString());
        }

    }
}
