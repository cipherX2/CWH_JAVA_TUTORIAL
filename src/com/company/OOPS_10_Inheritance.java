package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;
    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }
}

public class OOPS_10_Inheritance {
    public static void main(String[] args) {
        //Creating an object of base class
        Base obj = new Base();
        obj.setX(12);
        System.out.println("x=" + obj.getX());

        // Creating an object of derived class
        Derived ice = new Derived();
        ice.setY(21);
        System.out.println("y=" + ice.getY());
    }
}
