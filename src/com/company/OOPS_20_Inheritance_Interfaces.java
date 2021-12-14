package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSample extends sampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements childSample{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}

public class OOPS_20_Inheritance_Interfaces {
    public static void main(String[] args) {
        MySampleClass ip = new MySampleClass();
        ip.meth1();
        ip.meth2();
        ip.meth3();
        ip.meth4();
    }
}
