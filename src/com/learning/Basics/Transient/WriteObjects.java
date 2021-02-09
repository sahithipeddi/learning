package com.learning.Basics.Transient;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing Objects....");

        Person.setCount(8);
        Person person1 = new Person(1, "Sri");

        Person person2 = new Person(2,"Nemo");

        System.out.println(person1);
        System.out.println(person2);

        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))){

                os.reset();
                os.writeObject(person1);
                os.writeObject(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
