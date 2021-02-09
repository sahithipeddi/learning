package com.learning.Basics;

/* Encapsualtion means data declared in a class is hidden from other classes
* Setters are also called Mutators
*
* */

public class GettersandSetters {

        public static void main(String[] args) {

            Person1 one = new Person1();
            one.setName("Joe");
            one.setAge(25);
            one.speak();
            one.getAge();
            int yearsleft = one.calculateYearstoRetirement();

            System.out.println("Years left:" +yearsleft);


            Robot bot = new Robot();
            String message = "Hi this is bot";
            int value = 14;
            bot.speak(message);
            bot.jump(value);
            bot.move("North",20.0);


            Frog frog1 = new Frog();

            frog1.setAge(2);
            frog1.setName("Max");

            System.out.println("My frog name is: "+frog1.getName()+" and my age is: "+frog1.getAge());

        }

}


class Frog{

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}



class Person1{

    private String name;
    private int age;

    void speak(){
        System.out.println("My name is:" +name);
    }

    int calculateYearstoRetirement(){
        int yearsLeft = 65-age;

        return yearsLeft;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setInfo(String name, String age){
        setName(name);
    }

}

class Robot{

//    Passing a parameter. Parameter is a variable that we pass into the method.

    public void speak(String message){
        System.out.println(message);
    }

    public void jump(int height){
        System.out.println("Jumping height is: " +height);
    }

    public void move(String direction, double distance){
        System.out.println("Moving distance: "+distance+ " in Direction: "+direction);
    }
}
