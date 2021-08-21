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

        //In java objects are always reference types
        //What we did here is called shallow copy or copy reference
        //We learned that there are also primitive types (also called value types)
        //so what is the difference between the two?

        //In order to get it lets first understand what is the heep and the stack.
        //Stack is the place where we save all of our primitive types
        //Reference types are stored on the heap and each of them has a unique address
        //a reference to this unique address is stored on the stack
        //So basically when do a shallow copy (or shallow clone) we are just copying the pointer
        //the object stays the same in the heap
        //I mentioned immutable objects few lessons ago when talking about string.
        //immutable object can't be manipulated or changed on the heap

        //So what is happening when copying primitive types?
        //in this case we copy by value (deep copy or deep clone).
        //Here is an example:
        
        int a=5;
        int b=a;

        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

        a=10;

        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        
        //As you can see this time changing a didn't caused b to change, this is
        //because when we deep copied,
        //we copied the value and stored another copy of the same value inside the heep
        //instead of copying an address, this happened because if you remember primitive types
        //are always stored on the stack

        //Arrays are also considered as reference type
        //When we are changing a string we are saving it in another location in the heap
        //and change the pointer, this is why String is immutable
    }
}
