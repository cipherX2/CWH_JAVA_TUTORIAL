package com.company;

import java.util.Scanner;

class MyCustomException extends Exception {
    @Override
    public String getMessage() {
        return "Err. Maximum limit reached...";
    }

}

public class OOPS_39_Practice_Set {
    public static void main(String[] args) {
        // Question:1

        // int result = a+b This is a syntax err.
        int a = 0;
        int b = 100;
        // int c = b/a; This statement will throw a runtime exception

        // Question 2
        Scanner sc = new Scanner(System.in);
        /* int b1 = sc.nextInt();
        int a1 = sc.nextInt();
        if (a1 >= 10) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("HeHe");
            }
        } else {
            try {
                int c1 = b1 / a1;
                System.out.println(c1);
            } catch (ArithmeticException e) {
                System.out.println("HaHa");
            }
        }
         */

        // Question 3
        /* boolean flag = true;
        int count = 0;
        int arr[] = new int[10];
        for(int i=0;i< arr.length;i++){
            arr[i] = i + 1;
        }
        while(flag){
            int ind = sc.nextInt();
            try {
                if(count < 5){
                    try{
                        int value = arr[ind];
                        System.out.println(value);
                    }catch (Exception e){
                        System.out.println(e);
                        count++;
                    }
                }else{
                    System.out.println("Err. Maximum limit reached...");
                    break;
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
         */

        // Question 4

        boolean flag = true;
        int count = 0;
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        while (flag) {
            if (count > 5) {
                try {
                    throw new MyCustomException();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    flag = false;
                }
            } else {
                try {
                    int ind = sc.nextInt();
                    int ind_value = arr[ind];
                    System.out.println(ind_value);
                } catch (Exception e) {
                    System.out.println(e);
                    count += 1;
                }
            }
        }

    }
}
