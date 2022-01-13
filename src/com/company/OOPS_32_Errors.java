package com.company;

import java.util.Scanner;

public class OOPS_32_Errors {
    public static void main(String[] args) {
        // RUNTIME ERRORS
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.format("Integer part of 1000 divided by %d is %d",k, 1000 / k);
        // This will throw an arithmetic exception if 0 is entered. Try it out yourself.
    }
}
