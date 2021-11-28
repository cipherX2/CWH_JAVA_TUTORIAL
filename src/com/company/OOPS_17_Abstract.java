package com.company;

abstract class MyParent{
    public MyParent(){
        System.out.println("I'm constructor of base 2");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void newWedsGreet();
}

class BigChild extends MyParent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }

    @Override
    public void newWedsGreet(){
        System.out.println("Happy Married Life! ;)");
    }
}

abstract class SmallChild extends MyParent{
    public void th(){
        System.out.println("Hello Mom! Good Morning");
    }
}

public class OOPS_17_Abstract {
    public static void main(String[] args) {
        BigChild sam = new BigChild();
        // MyParent pseudo = new MyParent(); // Cus it's an abstract class.
        // SmallChild ip = new SmallChild();
    }
}
