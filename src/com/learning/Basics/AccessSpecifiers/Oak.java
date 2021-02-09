package com.learning.Basics.AccessSpecifiers;

public class Oak extends Plant {

    public Oak(){

//        Wont work type is private
//        type = "tree";


//        This works as size is protected and oak is a subclass of plant.
        this.size="large";


//        No access specifier, works as Oak and Plant are in same package.
        this.height = 9;
    }
}
