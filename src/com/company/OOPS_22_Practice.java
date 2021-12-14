package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

abstract class FountainPen extends Pen{
    abstract void changeNib();
}

class Monkey{
    void jump(){
        System.out.println("Jumping in 3,2,1 ....");
    }
    void bite(){
        System.out.println("Biting hard!!");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating Chicken and rice...");
    }
    public void sleep(){
        System.out.println("Sleeping 9 hrs a day :) ");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Pick up the phone");
    }
    void lift(){
        System.out.println("Call on hold");
    }
    void disconnect(){
        System.out.println("Call Disconnected");
    }
    void saveNumber(int number){
        System.out.println("Saving number....");
    }
}

interface TvRemote{
    void changeChannel();
    void increaseSound();
    void menu();
}

interface SmartTvRemote extends TvRemote{
    void switchToNetflix();
    void playYoutube();
    void playGame();
}

class Tv implements TvRemote{
    public void changeChannel(){
        System.out.println("Changing Channel...");
    }
    public void increaseSound(){
        System.out.println("Increasing sound from default");
    }
    public void menu(){
        System.out.println("Displaying Menu");
    }
}

public class OOPS_22_Practice {
    public static void main(String[] args) {
        Human dt = new Human();
        dt.sleep();
        dt.bite();

        Monkey op = new Human();
        // op.eat(); --> This is invalid
        op.bite(); // This is allowed


    }
}
