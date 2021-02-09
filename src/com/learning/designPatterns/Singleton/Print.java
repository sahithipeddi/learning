package com.learning.designPatterns.Singleton;

public class Print {
    private static Print print = new Print();

    public static Print getInstance() {
        return print;
    }

    private Print() {
    }
}
