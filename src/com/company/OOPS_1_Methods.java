package com.company;

import java.util.Scanner;

public class OOPS_1_Methods {

    // If we want to associate this function to the class not its object.
    static int Add(int x, int y) {
        if (x > y) {
            return x + y;
        } else {
            return (2 * x) + y;
        }
    }

    // If we want to associate this function to the object not the class.
    int Subtract(int p, int q){
        return p - q;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = Add(a, b);
        System.out.println("The sum is: " + c);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Method Invocation using object creation.
        OOPS_1_Methods obj = new OOPS_1_Methods();
        int result = obj.Subtract(num1, num2);
        System.out.println("The difference is: " + result);

    }
}
