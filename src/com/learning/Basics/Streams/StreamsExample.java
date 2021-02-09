package com.learning.Basics.Streams;

/*
* Streams are sequence of elements supporting serial and parallel aggregate operations
*
* */


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("test", "test", 25),
                new Person("lin", "lolo", 30),
                new Person("Joe", "yoki", 45));

//         people.stream().filter((p) -> p.getLastName().startsWith("l")).map((p) -> p.getLastName()).map(String::new).findFirst();

        Stream <String> l = people.stream().filter((p) -> p.getLastName().startsWith("l")).map((p) -> p.getLastName());

        System.out.println(l);
    }

}
class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,String lastName, int age)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public Person(String firstName)
    {
        super();
        this.firstName = firstName;


    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person [firstName=" +firstName + ", lastName=" +lastName + ", age="+age +"]";
    }

}