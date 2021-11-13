package com.company;
import java.util.Scanner;

public class OOPS_2_MethodOverloading {

    static void TellJoke(){
        System.out.println("I invented a new word-- Plagiarism");
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }

    static void foo(){
        System.out.println("Hello Good Evening! Bruh");
    }

    static void foo(int a){
        System.out.println("Hello Good Evening " + a + " bro");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TellJoke();
        int [] marks = {12, 21, 31, 23, 31};

        /*
         Case 1: Changing an Integer
         int x = 45;
         change(x);
         System.out.println("The value of x after changing is: "+ x);
        */

         /*
         Case 1: Changing the Array
         change2(marks);
         System.out.println("The value of x after changing is: "+ marks[0]);
         This will change because here we are reference(marks) of the array.
         */

        // Method Overloading
        foo();
        foo(sc.nextInt());
    }
}
