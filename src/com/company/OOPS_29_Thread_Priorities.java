package com.company;
import java.lang.Thread;

class MyThr2 extends Thread{
    public MyThr2(String name){
        super(name);
    }

    public void run(){
        int i =1;
        while( i<=10){
            System.out.println("I am a thread "+ this.getName());
            i+=1;
        }
    }
}

public class OOPS_29_Thread_Priorities {
    public static void main(String[] args) {
        MyThr2 t1 = new MyThr2("cheems");
        MyThr2 t2 = new MyThr2("doge");
        MyThr2 t3 = new MyThr2("vidhayakji");
        MyThr2 t4 = new MyThr2("gulambi");
        MyThr2 t5 = new MyThr2("cipher(most important)");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
