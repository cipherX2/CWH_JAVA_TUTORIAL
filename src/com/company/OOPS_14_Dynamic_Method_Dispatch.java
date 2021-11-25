package com.company;

class Phone{

    public void greet(){
        System.out.println("Hi! Good Morning");
    }

    public void name(){
        System.out.println("My name is Java");
    }
}

class SmartPhone extends Phone{
    @Override
    public void name(){
        System.out.println("My name is Java in class Two");
    }

    public void okay(){
        System.out.println("No problem!! It's Okay");
    }

}

public class OOPS_14_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        // Phone obj = new Phone();
//        // SmartPhone ass = new SmartPhone();
//        // obj.name();

        Phone mac = new SmartPhone(); // Yes it's allowed -- > Dynamic method dispatch
        // SmartPhone not = new Phone(); // No it's not allowed

        mac.greet();
        mac.name();

    }
}
