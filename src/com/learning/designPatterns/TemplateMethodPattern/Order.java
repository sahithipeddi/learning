package com.learning.designPatterns.TemplateMethodPattern;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Order {

    public enum OrderType {
        ONLINE, STORE, WAREHOUSE;
    }

    public int orderID;

    public List<Products> products;

    public LocalDate date;

    public int amount;

    private OrderType type;


    public void validate(){

        if(type == OrderType.STORE){
            System.out.println("Store order");
        }else if(type == OrderType.STORE){
            System.out.println("Store order");
        }else if (type == OrderType.STORE){
            System.out.println("Store order");
        }

    }

    public void process(){

        if(type == OrderType.STORE){
            System.out.println("Store order");
        }else if(type == OrderType.STORE){
            System.out.println("Store order");
        }else if (type == OrderType.STORE){
            System.out.println("Store order");
        }

    }

    public void cancel(){
        System.out.println("Cancel Logic");
    }
}
