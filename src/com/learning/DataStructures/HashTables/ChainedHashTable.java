package com.learning.DataStructures.HashTables;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable(){
        hashtable = new LinkedList [10];
    }

    private int hashing(String key){

        return key.length() % hashtable.length;


    }

    public void put(String key, StoredEmployee employee){
        int hashCode = hashing(key);

        hashtable[hashCode].add(employee);

    }

    public StoredEmployee get(String key){

        int hashCode = hashing(key);

        StoredEmployee employee = null;

        ListIterator iterators = hashtable[hashCode].listIterator();

        while (iterators.hasNext())
        {
            employee = (StoredEmployee) iterators.next();

            if (employee.key.equals(key)){
                return employee;
            }
        }

        return null;

    }

    public Employee remove(String key){
        int hashCode = hashing(key);

        StoredEmployee employee = null;

        ListIterator iterators = hashtable[hashCode].listIterator();

        int index = -1;

        while (iterators.hasNext())
        {
            employee = (StoredEmployee) iterators.next();
            index++;
            if (employee.key.equals(key)){
                break;
            }
        }

        if(employee == null || !employee.key.equals(key) ){

            return null;

        }

        else {
            hashtable[hashCode].remove(index);
            return employee.employee;
        }
    }

    public void printHastable(){
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()){
                System.out.println("Position " + i + ": empty");
            }
            else {

                System.out.println("Position " + i);

                ListIterator<StoredEmployee> employeeListIterator = hashtable[i].listIterator();

                while (employeeListIterator.hasNext()){
                    System.out.println("Employyee is : " + employeeListIterator.next().employee);
                }
            }
        }
    }
}
