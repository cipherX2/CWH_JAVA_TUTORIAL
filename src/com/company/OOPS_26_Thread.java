package com.company;

class MyThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<=100) {
            System.out.println("My cooking thread is running ");
            System.out.println("I am happy.");
            i++;
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i != 100){
            System.out.println("Thread2 is used to chat with friends");
            System.out.println("I am sad");
            i += 1;
        }
    }
}

public class OOPS_26_Thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
    }
}
