package com.learning.designPatterns.TemplateMethodPattern;

public class TestExcel {

    public static void main(String[] args){

//        StopWatch time = new StopWatch();

        DataProcessor obj = new ExcelFile();

        /*obj.readData();
        obj.processData();
        obj.saveData();*/

        obj.readProcessAndSaveData();

         obj = new TextFile();

       /* obj2.readData();
        obj2.processData();
        obj2.saveData();*/

        obj.readProcessAndSaveData();

    }

}
