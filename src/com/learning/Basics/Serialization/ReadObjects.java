package com.learning.Basics.Serialization;

/*If you take a object and serialize it i.e. turning the object into bytes and deserialization is taking the binary form and turning it back to raw data
 *
  * we're looking at serialization to files. - This is referred to as serializing in java.
  *
  *
  * How do you make class serializable in java? Just that class should implement Serializable
  *
  * */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

    public static void main(String[] args) {

        System.out.println("Reading Objects....");

        try (FileInputStream fi = new FileInputStream("people.bin")) {

            ObjectInputStream oi = new ObjectInputStream(fi);

            Person person1 = (Person) oi.readObject();

            Person person2 = (Person) oi.readObject();

            System.out.println(person1);
            System.out.println(person2);

            oi.close();

        }catch (ClassNotFoundException e) {
                e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
