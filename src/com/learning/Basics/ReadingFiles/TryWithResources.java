package com.learning.Basics.ReadingFiles;

class Temp implements AutoCloseable{


    @Override
    public void close() throws Exception {
        System.out.println("CLosing");
        throw new Exception("Oh!No");
    }
}

public class TryWithResources {

    public static void main(String[] args) {


        try(Temp temp = new Temp()) {


        } catch (Exception e) {
            e.printStackTrace();
        }

      /*  try {
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/


    }
}
