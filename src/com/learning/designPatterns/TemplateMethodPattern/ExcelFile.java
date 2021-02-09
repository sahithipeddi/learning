package com.learning.designPatterns.TemplateMethodPattern;

public class ExcelFile extends DataProcessor{

    public void readData(){

        System.out.println("Read Data from Excel file");
    }

    public void processData(){

        System.out.println("process Data from Excel file");
    }


}
