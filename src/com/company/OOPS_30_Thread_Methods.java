package com.company;

class MyNewThr extends Thread{
    public void run(){
        int i =1;
        while( i<=100000){
            System.out.println("I am a thread "+ this.getName());
            try{
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i+=1;
        }
    }
}

class MyNewThr1 extends Thread{
    public void run(){
        int i =1;
        while( i<=100000){
            System.out.println("I am a thread "+ this.getName());
            i+=1;
        }
    }
}

public class OOPS_30_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr t1 = new MyNewThr();
        MyNewThr1 t2 = new MyNewThr1();
        t1.start();
//        try {
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
