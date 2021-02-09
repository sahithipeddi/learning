package com.learning.Collections.Iterators;

import java.util.LinkedList;
import java.util.List;

public class ImplementingIterable {

    public static void main(String[] args) {

    UrlLibrary urlLibrary = new UrlLibrary();

        for (String url:
             urlLibrary) {

            System.out.println(url);

        }

    }
}
