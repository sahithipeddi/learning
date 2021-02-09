package com.learning.designPatterns.TemplateMethodPattern;

public class TextFile extends DataProcessor {

    public void readData(){

        System.out.println("Read Data from Text file");
    }

    public void processData(){

        System.out.println("process Data from Text file");
    }


}
