package com.learning.Collections.ComplexDataTypes;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDTypesTest {

    public static String[] vehicles = {
            "ambulance", "helicopter", "lifeboat"
    };


    public static String[][] drivers = {
            {"Peter", "Freddy", "Sue"},
            {"Sur", "Richard", "Bob", "Fred"},
            {"Pete", "Mary", "Bob"},
    };

    public static void main(String[] args) {


        Map <String, Set <String>> authority = new HashMap <>();

     {
        for (int i = 0; i < vehicles.length; i++) {

            String vehicle = vehicles[i];

            String[] driversList = drivers[i];

            Set <String> driversSet = new LinkedHashSet <>();

            for (String driver : driversList) {

                driversSet.add(driver);

            }

                authority.put(vehicle, driversSet);
        }

//        Iterate through whole thing

        for(String vehicle: authority.keySet()){

            System.out.print(vehicle);
            System.out.print(": ");
            Set<String> driversList = authority.get(vehicle);

            for(String driver: driversList){
                System.out.print(driver);
                System.out.print(" ");
            }
            System.out.println();


        }

    }



    }

}
