package com.learning.designPatterns.SuperClassExample;

public class TestSuperClass {

    public static void main(String[] args){

          SubClassC classc = new SubClassD();
          classc.subClassC();

          SubClassD classD = new SubClassD();
          classD.subClassD();

//        SubClassD classc = new SubClassD();
//        classc.subClassC();
//        classc.subClassD();
    }
}
