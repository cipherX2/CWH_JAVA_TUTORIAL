package com.company;

import java.util.Scanner;

public class OOPS_4_MethodPractice {

    static void MultiplicationTable(int x) {
        for (int i = 1; i < x; i++) {
            System.out.print(x);
            System.out.print(" * " + i + " = ");
            System.out.print(x * i);
            System.out.println(" ");
        }
    }

    void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

    int SumOfNumbers(int x){
        if(x == 1){
            return 1;
        }
        return x + SumOfNumbers(x - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOPS_4_MethodPractice obj = new OOPS_4_MethodPractice();

        MultiplicationTable(sc.nextInt());
        obj.Pattern(sc.nextInt());

        System.out.println("The sum is " + obj.SumOfNumbers(sc.nextInt()));

    }
}
