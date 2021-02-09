package com.learning.designPatterns.SuperClassExample;

public class WebService implements Email {

    @Override
    public void sendEmail() {

        System.out.println("Implements WebService Email");

    }
}
