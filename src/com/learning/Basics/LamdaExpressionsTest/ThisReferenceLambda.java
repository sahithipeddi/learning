package com.learning.Basics.LamdaExpressionsTest;

public class ThisReferenceLambda {

    public static void main(String[] args) {

        ThisReferenceLambda thisReferenceLambda = new ThisReferenceLambda();

        /*thisReferenceLambda.doProcess(10, new Process() {
            @Override
            public void process(int i) {

                System.out.println("Value of i is: ");
                System.out.println(this);
            }
        });*/

        /* this reference refers to a instance of anaomynous inner class
          * In case of lambda instance doens't touch this reference.. It is unmodified.
          * Value of this reference is same as what it is
          *
           * */

       /* thisReferenceLambda.doProcess("Hi", (p) -> {
            System.out.println("Value is: "+p);

        });*/

        thisReferenceLambda.execute();

    }

    public void execute(){
        doProcess(10, (p) -> {
            System.out.println("Value is: "+p);
            System.out.println(this);

        });
    }

    public void doProcess(int i, Process p) {

        p.process(i);
    }
}
interface Process {
    default void process(String i){
        System.out.println("value is: "+i);
    }

    void process(int i);
}