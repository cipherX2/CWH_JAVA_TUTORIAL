package com.company;

interface MyCamera {
    void takeSnap();

    void recordVideo();

    default void greetStranger() {
        System.out.println("Hello I am Dinesh and I am 18 years old" +
                " and I am pursuing Bachelors degree in Computer Engineering....");
    }

    default void greet() {
        System.out.println("Good Morning....");
    }

    default void record4kVideo() {
        greet();
        System.out.println("Recording 4k video......");
    }

    default void playMusicHD() {
        System.out.println("Playing High Definition Music....");
    }
}

interface MyWifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellphone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting.... ");
    }
}

class MySmartPhone2 extends MyCellphone implements MyCamera, MyWifi {
    public void takeSnap() {
        System.out.println("Taking snap!!");
    }

    public void recordVideo() {
        System.out.println("Recording video....");
    }

    public String[] getNetworks() {
        System.out.println("Getting a list of networks...");
        String[] networkList = {"Airtel", "Jio", "BSNL"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class OOPS_21_Polymorphism {
    public static void main(String[] args) {
        MyCamera cam = new MySmartPhone2();
        // cam.getNetworks(); --> not allowed
    }
}
