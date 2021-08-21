package com.company;

public class Main {
    //Different object might share same characteristics for example: car, bus, and motorcycle
    //share same characteristics like wheels, engine, current state (is engine on or off)
    //So car bus and motorcycle share common characteristics but yet each of them has additional
    //features that make it different from the others
    //different amount of wheels, different engine and so on)
    //OOP allows us to create classes which inherit common state and behavior from
    //other classes
    public static void main(String[] args) {
        Animal animal=new Animal("animal",1,1,1);
        Horse horse=new Horse("horse",100,400,5);
        System.out.println("----------------------------");
        Horse horse2=new Horse("horse2",200,500,10,false,"white");
        System.out.println("----------------------------");
        horse.eat();
        System.out.println("----------------------------");
        Horse horse3=new Horse("Horsy",800,900,30,true,"Brown");
        horse.eat();
        System.out.println("----------------------------");
        animal.move(10);
        horse.move(20);
        System.out.println("----------------------------");
        horse.walk();
        horse.run();
        System.out.println("----------------------------");
        Fish fish=new Fish(4,5,6);
        System.out.println("----------------------------");
        System.out.println(horse.makeSound());
        System.out.println(horse.makeSound("Hello"));

    }
}
