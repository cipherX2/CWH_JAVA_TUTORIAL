package com.company;

class A {
    public int a = 6;

    int harry() {
        return 4;
    }

    void meth2() {
        System.out.println("I'm method 2 of class A");
    }
}

class B extends A {
    @Override
    public void meth2() {
        System.out.println("I'm method 2 of class B");
    }

    void meth3() {
        System.out.println("I'm method 3 of class B");
    }
}

public class OOPS_13_Method_Overriding {
    public static void main(String... args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
