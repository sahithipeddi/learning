package com.learning.Collections.ObjectsToMap;

import java.util.*;


class Person{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

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
}





public class ObjectsToMap {

    public static void main(String[] args) {

        Person p1 = new Person(1,"Bob");
        Person p2 = new Person(2,"Mike");
        Person p3 = new Person(3,"Jack");
        Person p4 = new Person(2,"Mike");

        Map<Person, Integer> map = new LinkedHashMap <Person, Integer>();

        map.put(p1,5);
        map.put(p2,10);
        map.put(p3,1);
        map.put(p4,4);

        for(Person element: map.keySet()){
            System.out.println( element + " : " + map.get(element));
        }

        Set<Person> set = new LinkedHashSet <Person>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);

    }
}
