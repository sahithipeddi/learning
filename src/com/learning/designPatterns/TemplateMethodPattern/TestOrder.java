package com.learning.designPatterns.TemplateMethodPattern;

public class TestOrder {


    /*
    * Abstract classes cannot be instantiated.

        If a class has at least one abstract method, then the class must be declared abstract.

        To use an abstract class, we must create a class that extends the abstract class (inheritance) and provide implementations for all abstract methods.

        Java does not support multiple inheritance so we are only allowed to extend one class (abstract or not).    There is where interfaces become useful.

     */

    public static void main(String[] args){

        DataProcessorOrder order = new WebOrder();

        order.validate();

        order.process();

        order = new WareHouseOrder();

        order.validate();

        order.process();

        order = new StoreOrder();

        order.validate();

        order.process();
    }
}
