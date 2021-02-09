package com.learning.Basics.Serialization;

import java.io.*;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing Objects....");

        Person person1 = new Person(1, "Sri");
        Person person2 = new Person(2,"Nemo");

        System.out.println(person1);
        System.out.println(person2);

        try(FileOutputStream fs = new FileOutputStream("people.bin")){

            try (ObjectOutputStream os = new ObjectOutputStream(fs)) {

                os.reset();
                os.writeObject(person1);
                os.writeObject(person2);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
