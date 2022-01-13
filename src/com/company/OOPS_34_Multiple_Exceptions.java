package com.company;

import java.util.Scanner;

public class OOPS_34_Multiple_Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 12;
        marks[1] = 56;
        marks[2] = 11;
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide with: ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array value/number is: " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred is");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException ei) {
            System.out.println("Array Index Out Of Bounds Exception occurred ");
            System.out.println(ei);
        } catch (Exception ep) {
            System.out.println("Some other Exception occured: ");
            System.out.println(ep);
        }
    }
}
