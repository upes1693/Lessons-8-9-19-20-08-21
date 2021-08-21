package com.company;

public class ReferenceVSValue {

    public static void main(String[] args) {
        Horse purpleHorse = new Horse("aaa", 10, 10, 10, false, "Purple");
        Horse anotherHorse = purpleHorse;

        System.out.println(purpleHorse.getColor());
        System.out.println(anotherHorse.getColor());

        anotherHorse.setColor("Black");

        System.out.println(purpleHorse.getColor());
        System.out.println(anotherHorse.getColor());

        Horse whiteHorse = new Horse("bbb", 50, 50, 50, true, "White");
        anotherHorse = whiteHorse;
        System.out.println("=============================");
        System.out.println(purpleHorse.getColor());
        System.out.println(anotherHorse.getColor());
        System.out.println(whiteHorse.getColor());


        int a=5;
        int b=a;

        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

        a=10;

        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
    }
}
