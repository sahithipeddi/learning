package com.learning.Basics.Equals;

import java.util.Objects;

class Person{

    private int id;

    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {

        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}

public class EqualsMethod {

    public static void main(String[] args) {

        System.out.println(new Object());

        Person person = new Person(4, "sa");

        Person person1 = new Person(4,"sa");

//        == tell if they are similar objects
        System.out.println(person1 == person);

//        If the value is equal they should be equal and this can be achieved by using .equals method


        System.out.println(person1.equals(person));


        String text1 =  "hello";
        String text2 =  "hellojnfr".substring(0,5);

        System.out.println(text2);

        System.out.println(text1 == text2);

//        Always use .equals for String

        System.out.println(text1.equals(text2));



    }
}
