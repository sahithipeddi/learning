package com.learning.designPatterns.SuperClassExample;

public class TestEmployee {

    public static void main(String[] args){

        Email email = new Outlook();

        Employee emp1 = new Employee(100, "Sahithi", email);

        emp1.notifyEmployee();

        email = new WebService();

        Employee emp2 = new Employee(400, "TestSahithi",email);

        emp2.notifyEmployee();

    }

}
