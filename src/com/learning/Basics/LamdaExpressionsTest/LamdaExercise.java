package com.learning.Basics.LamdaExpressionsTest;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

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

public class LamdaExercise {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Sahithi", "Peddi", 25),
                new Person("Nemo", "lolo", 30),
                new Person("Joe", "yoki", 45));


        Collections.sort(people, new Comparator <Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });


      printAll(people);

        printLastNameBeginnningCConcditionally(people, (p) -> p.getLastName().startsWith("P"));

//        ()-> {
//            agreemen.agreeNumber.type.
//        } ()-> {
//            agreemen.agreeNumber.type.
//        }


    }

    private static void printAll(List<Person> people){

        for (Person p:
             people) {

            System.out.println(p);
            
        }
        
    }


    private static void printLastNameBeginnningC(List<Person> people){

        for (Person p:
                people) {

            if(p.getLastName().startsWith("P")) {
                System.out.println("In loop");
                System.out.println(p);
            }
        }

    }


    private static void printLastNameBeginnningCConcditionally(List<Person> people,Predicate<Person> condition){

        for (Person p:
                people) {

            if(condition.test(p)) {
                System.out.println("In loop");
                System.out.println(p);
            }
        }

    }



}


//interface Condition{
//
//    public boolean test(Person p);
//}