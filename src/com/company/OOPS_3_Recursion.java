package com.company;
import java.util.Scanner;

public class OOPS_3_Recursion {
    static int a = 0;
    static int b = 1;

    static int factorial(int n){
        // factorial = n * (n - 1) * ..... 1
        // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120

        if (n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }

    }

    static void fibo(int n){
        // 0, 1, 1, 2, 3 ,5, 8, ......
        if (n >= 1){

            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fibo(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n;
        n  = S.nextInt();
        System.out.println("The value of factorial n is: " + factorial(n));

        System.out.println("Enter the nth term: ");
        int term = S.nextInt();
        System.out.print(a + " " + b);
        fibo(term);

    }
}
