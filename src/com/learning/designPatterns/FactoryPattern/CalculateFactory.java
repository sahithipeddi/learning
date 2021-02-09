package com.learning.designPatterns.FactoryPattern;

public class CalculateFactory {

    public Calculate getCalculation(String type){

        Calculate obj = null;

        if(type.toLowerCase().equals("add")){
            obj = new Add();
        }

        if(type.toLowerCase().equals("divide")){
            obj = new Divide();
        }

        if(type.toLowerCase().equals("sub")){
            obj = new Substract();
        }
        else {
            System.out.println("Incorect action");
        }
        return obj;
    }
}
