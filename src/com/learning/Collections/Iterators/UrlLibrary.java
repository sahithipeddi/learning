package com.learning.Collections.Iterators;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class UrlLibrary implements Iterable<String>{

    private LinkedList<String> urls = new LinkedList <String>();


    private class UrlIterator implements Iterator<String>{

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {

            StringBuilder sb = new StringBuilder();

            try {
                URL url = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line = null;

                while( (line = br.readLine()) != null ){

                    sb.append(line);
                    sb.append("\n");
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }catch (Exception e) {
                e.printStackTrace();
            }

            index ++;

            return sb.toString();
        }

        @Override
        public void remove() {

            urls.remove(index);

        }
    }

    public UrlLibrary(){
        urls.add("https://www.geeksforgeeks.org/how-to-use-iterator-in-java/");
        urls.add("https://google.com");
        urls.add("https://www.caveofprogramming.com");

    }

    @Override
    public Iterator <String> iterator() {
        return new UrlIterator();
    }

   /* @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }*/


}
