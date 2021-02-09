package com.learning.designPatterns.SuperClassExample;

public class Outlook implements Email {

    @Override
    public void sendEmail() {

        System.out.println("Implements Outlook Email");

    }
}
