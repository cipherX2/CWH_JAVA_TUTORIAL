package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int b = 45;
    void bornHornK3g(int decrement);
    void blowHornHello(int increment);
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Applying horn.");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying gear.");
    }
    public void blowHornHello(int increment) {
        System.out.println("Hello World");
    }
    public void bornHornK3g(int decrement){
        System.out.println("Cipher_23");
    }
}

public class OOPS_18_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in interfaces
        System.out.println(cycleHarry.a);
        // You cannot modify the properties in Interfaces as they are final.
        // cycleHarry.a = 34;--> Throws error
        cycleHarry.bornHornK3g(3);

    }
}
