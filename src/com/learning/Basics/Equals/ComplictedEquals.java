package com.learning.Basics.Equals;

import java.util.HashSet;
import java.util.Set;

class Simpson{

    String name;

    Simpson(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Simpson otherSimpson = (Simpson) obj;
        return this.name.equals(otherSimpson.name) &&
                this.hashCode() == otherSimpson.hashCode();
    }

    @Override
    public int hashCode() {
        return (43 + 777);
    }
}


public class ComplictedEquals {


    public static void main(String... doYourBest) {
        System.out.println(new Simpson("Bart").equals(new Simpson("Bart")));
        Simpson overriddenHomer = new Simpson("Homer") {
            public int hashCode() {
                return (43 + 777) + 1;
            }
        };

        System.out.println(new Simpson("Homer").equals(overriddenHomer));

        Set set = new HashSet(3 ,0.7f);
        set.add(new Simpson("Homer"));
        set.add(overriddenHomer);

        System.out.println(set.size());
    }
}
