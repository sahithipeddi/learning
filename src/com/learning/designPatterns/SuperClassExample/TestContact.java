package com.learning.designPatterns.SuperClassExample;

public class TestContact {

    public static void main(String[] args){

        Contact contact1 = new Friend();
        contact1.name = "Sri";
        ((Friend)contact1).phnNumber="1234";

        System.out.println(contact1.toString());

        Contact contact2 = new Work();
        contact2.name = "Sri";
        ((Work)contact2).email="sped@ao.com";

        System.out.println(contact2.toString());

    }


}
