package com.company;

//This is our base classes that animals will inherit
public class Animal {
    private String name;
    private int size;
    public int weight;
    private int age;

    public Animal(){
        System.out.println("Default ctor was invoked");
    }

    public Animal(String name, int size, int weight, int age) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.age = age;
        System.out.println("Animal ctor");
    }

    public Animal(String name, int size){
        this(name,size,0,0);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }

    public void move(int speed){
        System.out.println(this.name + " is moving at: "+speed);
    }

    public String makeSound(){
        return "";
    }
}
