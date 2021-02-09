package com.learning.Basics.Casting;

public class Casting {

    public static void main(String[] args) {

        byte byteValue = 113;
        short shortValue = 55;
        int intValue = 888;
        long value =  55567;

        float floatValue = 13.8f;

        float floatValue2 = (float) 99.3;

        double doubleValue = 12.3;

        System.out.println(Double.MAX_VALUE);


        intValue = (int)value;

        System.out.println(intValue);

        doubleValue = intValue;

        System.out.println(doubleValue);

        intValue = (int)floatValue;

        System.out.println(intValue);

//        The following won't work as we expect it to!! 128 is too big for a byte.

        byteValue = (byte)128;

        System.out.println(byteValue);
        
    }
}
