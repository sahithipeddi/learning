package com.learning.Basics.AccessSpecifiers;

public class Plant {
//    Bad practice

   public String name;

//   Acceptable practise -- as long as it's final
   public final static int SEQNUM=8;

   private String type;

   protected String size;
    int height;
   public Plant(){
       this.name = "I'm freddie";

       type = "plant";

//
       this.size = "medium";



   }





}
