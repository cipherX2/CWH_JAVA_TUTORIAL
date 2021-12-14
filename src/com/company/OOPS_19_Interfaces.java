package com.company;

interface Camera {
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

interface Wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellphone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting.... ");
    }
}

class MySmartPhone extends MyCellphone implements Camera, Wifi {
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

public class OOPS_19_Interfaces {
    public static void main(String[] args) {
        MySmartPhone ci = new MySmartPhone();
        String[] networksInCi = ci.getNetworks();
        for (String item : networksInCi
        ) {
            System.out.println(item);
        }
        ci.record4kVideo();
        ci.greetStranger();
    }
}
