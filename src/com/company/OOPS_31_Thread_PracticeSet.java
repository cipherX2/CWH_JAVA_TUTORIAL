package com.company;

class GreetPeople01 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Good Morning");
            i += 1;
        }
    }
}

class GreetPeople02 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Welcome to house.." + this.getPriority());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i += 1;
        }
    }
}

public class OOPS_31_Thread_PracticeSet {
    public static void main(String[] args) {
        GreetPeople01 g1 = new GreetPeople01();
        GreetPeople02 g2 = new GreetPeople02();
        g2.setPriority(Thread.MAX_PRIORITY);
        g1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(g1.getState());
        System.out.println(g2.getState());
        g2.start();
        System.out.println(g1.getState());
        System.out.println(g2.getState());
        g1.start();
        try{
            g1.join();
            g2.join();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(g1.getState());
        System.out.println(g2.getState());
        System.out.println("g1 is alive: " + g1.isAlive());
        System.out.println("g2 is alive: " + g2.isAlive());
    }
}
