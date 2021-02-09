package com.learning.designPatterns.TemplateMethodPattern;

public abstract class DataProcessor {

    public void readProcessAndSaveData(){

        readData();
        processData();
        saveData();
    }

    public abstract void readData();

    public abstract void processData();

    public void saveData(){

        System.out.println("Save Data from file");
    }

}

