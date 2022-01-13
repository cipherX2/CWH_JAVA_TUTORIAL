package com.company;

class MyThread2 extends Thread{
    public void run(){
        int i=1;
        while(i<100){
            System.out.println("I am a thread...");
            System.out.println("Thank you...");
            i+=1;
        }
    }
}

class MyThread12 extends Thread{
    public void run(){
        int i=1;
        while(i<12){

            System.out.println("I am a new thread...");
            System.out.println("Sad for you...");
            i+=1;
        }
    }
}

public class OOPS_30_Thread_Methods{
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread12 t2 = new MyThread12();
        t1.start();
        try {
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}