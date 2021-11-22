package com.company;

class Base1{
    Base1(){
        System.out.println("I'm a constructor");
    }
    Base1(int a){
        System.out.println("I'm an overloaded constructor with value of a as: " + a);
    }
}

class Derived1 extends Base1{
    Derived1(){
        // super(0);
        System.out.println("I'm a derived class constructor");
    }

    Derived1(int x,int y){
        super(2);
        System.out.println("Hi! I'm overloaded with value "+ x+ " and " + y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I'm  a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I'm an overloaded constructor of derived with value of z as: " + z);
    }
}

public class OOPS_12_Constructors_In_Inheritance {
    public static void main(String[] args) {
        // Base op = new Base();
        ChildOfDerived ip = new ChildOfDerived(2,3,3);

    }
}
