package com.learning.Collections.SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Person{

    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {

        int len1 = s1.length();

        int len2 = s2.length();

        if(len1>len2){

            return 1;
        }

        else if (len1<len2){
            return -1;
        }


        return 0;
    }
}


class AlphabeticalComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
/*Comparteto is a method of comparable interface. This defines natural order */
        return s1.compareTo(s2);

    }
}

class ReverseAlphabeticalComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        /*Comparteto is a method of comparable interface. This defines natural order */
        return -s1.compareTo(s2);

    }
}


public class SortingLists {

    public static void main(String[] args) {
/* The order in which it's sorting is a natural order and it the same way as tree set and also a tree map sorts keys in
*
* If we have to sort anything else in List, We ned to create a class which implements comparator interface.
* */

//////////////Sorting Strings ///////////

        List<String> animals = new ArrayList <String>();

        animals.add("Elephatn");
        animals.add("snake");
        animals.add("Lion");
        animals.add("Mongoose");
        animals.add("Cat");



//        Collections.sort(animals, new StringLengthComparator());
//        Collections.sort(animals, new AlphabeticalComparator());
        Collections.sort(animals, new ReverseAlphabeticalComparator());
        for(String animal:animals){
            System.out.println(animal);
        }

//////////////Sorting Numbers ///////////
        List<Integer> numbers = new ArrayList <Integer>();

        numbers.add(54);
        numbers.add(1);
        numbers.add(36);
        numbers.add(73);
        numbers.add(9);

        Collections.sort(numbers, new Comparator <Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
            }
        });

        for(Integer number: numbers){
            System.out.println(number);
        }


///////////////Sorting Arbitrary objects////////


        List<Person> people = new ArrayList <Person>();

        people.add(new Person(1,"Joe"));
        people.add(new Person(5,"Harry"));
        people.add(new Person(2,"Hermoine"));
        people.add(new Person(4,"Muffet"));

//        Sort in order of ID
        Collections.sort(people, new Comparator <Person>() {
            @Override
            public int compare(Person p1, Person p2) {

                if(p1.getId()>p2.getId()){
                    return 1;
                }else if(p1.getId()<p2.getId()){
                    return -1;
                }
                return 0;

            }
        });


        //        Sort in order of Name
        Collections.sort(people, new Comparator <Person>() {
            @Override
            public int compare(Person p1, Person p2) {

                return p1.getName().compareTo(p2.getName());


            }
        });

        for(Person person: people){
            System.out.println(person);

        }

    }
}
