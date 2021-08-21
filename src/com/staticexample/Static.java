package com.staticexample;

import com.accessmodifiers.AnotherClass;

public class Static {
    public static void main(String[] args) {
        int a = Calculator.calcSum(10, 20);
        System.out.println(a);

        Calculator calculator = new Calculator();
        Calculator calculator2= new Calculator();

        System.out.println(calculator.someNumber);
        System.out.println(calculator2.someNumber);

        Calculator.someNumber=5;

        System.out.println(calculator.someNumber);
        System.out.println(calculator2.someNumber);


    }
}
