package com.learning.Basics.Casting;

class Machine{


    public void start() {
        System.out.println("Machie started");
    }


}

class Camera extends Machine{

    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Photo taken");
    }

}


public class UpDownCasting {


    public static void main(String[] args) {

        Machine machine1 = new Machine();

        machine1.start();

        Camera camera1 = new Camera();

        camera1.start();
        camera1.snap();


//        Upcasting

        /*  Taken a variable of type camera which referes to Camera obj and assigned it to machine2 variable which is a Parent or going UP */

        Machine machine2 = camera1;

        machine2.start();

/*
        --- machine2.snap -- would return a error. It's the actual variable who decides which method can be accessed. Variable knows what methods are available for that

        variable type. machine2 is of type Machine and Machine has only start method.
*/


//      DownCasting.

        Machine machine3 = new Camera();

        Camera camera2 = (Camera) machine3;

        camera2.snap();

        ((Camera) machine2).snap();

//        This doesn't work. Run time error as machine4 is a variable of type Machine. You can't downcaste between unrelated types. Coz we can't change one object to other object all we can change the references that depend on underlying object.


        Machine machine4 = new Machine();

//        Camera camera3= (Camera) machine4;

//        camera3.start();
//        camera3.snap();

    }


}
