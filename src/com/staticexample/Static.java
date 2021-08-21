package com.staticexample;

import com.accessmodifiers.AnotherClass;

//Static vs instance variables
//Static variables are declared by using the static keyword
//All instances of the class share the same static variables
//Changing this variable will affect all other instances of the class
//We will declare a variable as static when we want it to be common to all the instances

//Instance variables are like field without static keyword
//They belong to a specific instance of a class
//Each instance has it's own copy of instance variable with a different value
//Lets remove the static from the field in the ctor and check what happens

//Static vs Instance methods
//Static methods are declared with the static keyword like the main method we always use
//Static method can't access instance methods and instance variables directly
//(remember I told you we need to make a method static in order to call it from the main method)
//Due to this static methods will usually be used for operation that are doesn't require
//data from an instance of the class (from this)
//So in static method we can't use this keyword
//Best practice- whenever you see a method that does not use instance variables
//that method should be declared as static method

//Instance method belongs to instance of a class
//In order to use it we have to initiate an instance first using the new keyword
//Instance method can access instance methods and variables directly and also

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
