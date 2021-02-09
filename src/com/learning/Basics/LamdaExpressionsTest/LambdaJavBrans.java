package com.learning.Basics.LamdaExpressionsTest;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaJavBrans {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Sahithi", "Peddi", 25),
                new Person("Nemo", "lolo", 30),
                new Person("Joe", "yoki", 45));


        /*Collections.sort(people, new Comparator <Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });*/

        Collections.sort(people,(o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        System.out.println("Printing All people");
        performConcditionally(people, p -> true,p-> System.out.println(p));


//        printLastNameBeginnningCConcditionally(people, (p) -> p.getLastName().startsWith("P"));
        System.out.println("Printing All people starting with letter P");

//        printLastNameBeginnningCConcditionally(people, (p) -> p.getLastName().startsWith("P"));
//        printLastNameBeginnningPredicate(people, (p) -> p.getLastName().startsWith("P"));
//        performConcditionally(people, p -> true , p-> System.out.println(p));

        performConcditionally(people, (p) -> p.getLastName().startsWith("P"), p-> System.out.println(p.getFirstName()));



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


    private static void printLastNameBeginnningPredicate(List<Person> people,Predicate<Person> condition){

        for (Person p:
                people) {

            if(condition.test(p)) {
//                System.out.println("In loop");
                System.out.println(p);
            }
        }

    }

    private static void printLastNameBeginnningCConcditionally(List<Person> people,Condition condition){

        for (Person p:
                people) {

            if(condition.test(p)) {
//                System.out.println("In loop");
                System.out.println(p);
            }
        }

    }

    private static void performConcditionally(List<Person> people,Predicate<Person> condition,Consumer<Person> printing){

        for (Person p:
                people) {

            if(condition.test(p)) {
//                System.out.println("In loop");
//                System.out.println(p);
                printing.accept(p);
            }
        }

    }


}


interface Condition{

    public boolean test(Person p);
}