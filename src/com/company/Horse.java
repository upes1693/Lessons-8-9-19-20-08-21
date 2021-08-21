package com.company;

//In order to inherit we will use the extends keyword
public class Horse extends Animal{

    //In case the father have an empty ctor we doesn't have to use super(), java will
    //use it in the background
    public Horse(){
        super();//this we happen in the background if we don't write it
    }

    //This constructor just initializing all the fields that we are inheriting from animal
    public Horse(String name, int size, int weight, int age){
        //super means call the constructor of the class we are extending (inheriting)
        //super has to be first statement in the ctor, and because this() also needs to
        //be first we can't use them together
        super(name, size, weight, age);
        System.out.println("Horse ctor");
    }

    //We can define some extra features for the horse i.e legs eyes
    //(since not animals have legs or eyes)
    private int legs;
    private int eyes;
    private boolean isMale;
    private String color;

    //Now we can create another constructor or change the previous one and add the additional fields
    public Horse(String name, int size, int weight, int age, boolean isMale, String color){
        this(name, size, weight, age);
        this.legs=4;
        this.eyes=2;
        this.isMale=isMale;
        this.color=color;
        System.out.println("Horse second ctor");
    }


    //We can override base class methods using the @Override annotation
    public void eat(){
        System.out.println("Horse is eating");
        chew();
        //call father eat() method using super
        super.eat();
    }

//    @Override
//    public void move(int speed){
//        System.out.println("Horse is moving");
//    }

    public void chew(){
        System.out.println("Horse is chewing");
    }

    public void walk(){
        System.out.println("horse is walking");
        move(20);
    }

    public void run(){
        System.out.println("horse is running");
        move(50);
    }

    public String makeSound(String word){
        return word;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }
}
