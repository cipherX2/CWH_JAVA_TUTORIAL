package com.company;

import java.util.Scanner;

public class OOPS_35_Nested_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 12;
        marks[1] = 56;
        marks[2] = 11;
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();
        try {
            System.out.println("Learning nested try catch");
            try {
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("That index does not seem to exist...");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }
    }
}
