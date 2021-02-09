package com.learning.Basics.Exceptions.MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.text.ParseException;

public class MultipleException1 {

    public static void main(String[] args) {

        Test test = new Test();

        /*try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {

            System.out.println("Couldn't parse command file");

        }*/

        /*try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
*/

        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
//            Example of Polymorphism where we can catch exceptions with EXCEPTION parent class.
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            test.input();

//            Exceptions should be handled in a right order. Child and Parents.
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
