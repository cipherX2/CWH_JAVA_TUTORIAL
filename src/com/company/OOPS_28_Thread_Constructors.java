package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while (i<=10){
            System.out.println("I am a thread "+ getName());
            i+=1;
        }
    }
}

public class OOPS_28_Thread_Constructors {
    public static void main(String[] args) {
        MyThr th = new MyThr("cipher");
        th.start();
        MyThr th1 = new MyThr("mamba");
        th1.start();
        System.out.println("The id of the thread th is: " + th.getId() );
        System.out.println("The id of the thread th1 is: " + th1.getId() );
    }
}
