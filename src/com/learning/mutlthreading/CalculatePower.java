package com.learning.mutlthreading;

import java.math.BigInteger;

public class CalculatePower {

    public static void main(String[] args) {
        BigInteger result;
        BigInteger power = new BigInteger("4");
        BigInteger base = new BigInteger("2");
        result = BigInteger.ONE;

        for(BigInteger i = BigInteger.ZERO;
            i.compareTo(power) !=0;
            i = i.add(BigInteger.ONE)) {
            result = result.multiply(base);
        }

        System.out.println(result);
    }
}
