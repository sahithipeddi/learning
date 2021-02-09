package com.learning.Collections.NaturalOrdering;

import java.util.*;

class Person implements Comparable<Person>{
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(Person person) {
        int len1 = name.length();
        int len2 = person.name.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else {
            return name.compareTo(person.name);
        }
    }
    /* @Override
    public int compareTo(Person person) {
            return name.compareTo(person.name);
    }*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}



public class NaturalOrderTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList <String>();

        SortedSet<String> set = new TreeSet <String>();


        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);

        System.out.println("Set Elements: ");

        showElements(set);

        List<Person> personList = new ArrayList <Person>();

        Set<Person> personSet = new TreeSet <Person>();


        addObjectsElements(personList);
        addObjectsElements(personSet);

        Collections.sort(personList);

        showObjectElements(personList);

        System.out.println("Set Elements: ");

        showObjectElements(personSet);

    }


    private static void addElements(Collection<String> col){

        col.add("Joe");
        col.add("Sue");
        col.add("Juliet");
        col.add("Claire");
        col.add("Mike");
        col.add("Dory");

    }

    private static void showElements(Collection<String> col){

       for(String element: col){
           System.out.println("Element is: "+element);
       }

    }

    private static void addObjectsElements(Collection<Person> col){

        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Claire"));
        col.add(new Person("Mike"));
        col.add(new Person("Dory"));

    }

    private static void showObjectElements(Collection<Person> col) {

        for (Person element : col) {
            System.out.println("Object Element is: " + element);
        }
    }
    }
