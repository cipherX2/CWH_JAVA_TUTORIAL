package com.company;

import java.util.Scanner;

public class OOPS_36_Exception_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        arr[0] = 10;
        arr[1] = 9;
        arr[2] = 8;
        arr[3] = 7;
        arr[4] = 6;
        arr[5] = 5;
        arr[6] = 4;
        arr[7] = 3;
        arr[8] = 2;
        arr[9] = 1;
        while (true) {
            int ind = sc.nextInt();
            try {
                int value = arr[ind];
                System.out.println(value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                break;
            }
        }
    }
}
