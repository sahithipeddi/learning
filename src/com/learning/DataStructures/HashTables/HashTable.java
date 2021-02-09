package com.learning.DataStructures.HashTables;

public class HashTable {


    private Employee[] hashtable;


    public HashTable(){

        hashtable = new Employee[10];

    }


    private int hashing(String key){

        return key.length() % hashtable.length;



    }

    public void put(String key, Employee employee){

        int hashkey = hashing(key);

        if(hashtable[hashkey] != null){
            System.out.println("Sorry there is already an employee in hashtable " +hashkey);
        }

        hashtable[hashkey] = employee;

        if(occupied(hashkey)) {
            int stopIndex = hashkey;

            if(hashkey == hashtable.length -1){
                hashkey =0;
            }
            else {
                hashkey++;
            }
        }
    }

    private boolean occupied(int hashkey) {

        return hashtable[hashkey]!= null;
    }

    public Employee get(String key){

        int hashKey = hashing(key);

        return hashtable[hashKey];
    }

    public void printHashtable(){

        for (Employee employee:
             hashtable) {
            System.out.println(employee);
        }
    }

}


class HashTableTest{

    public static void main(String[] args) {

        Employee employee2 = new Employee("Jane", "Doe", 2);

        Employee employee1 = new Employee("Jane","Jonas", 13);
        Employee employee3 = new Employee("Bill", "Ending", 1);
        Employee employee4 = new Employee("Mary","Smith", 8);

        HashTable hashTable = new HashTable();

        hashTable.put("Doe", employee2);
        hashTable.put("Jonas", employee1);
        hashTable.put("Ending", employee3);
        hashTable.put("Smith", employee4);
    }



}

