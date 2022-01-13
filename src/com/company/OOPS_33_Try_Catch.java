package com.company;

public class OOPS_33_Try_Catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println("The result is: " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide, Reason: ");
            System.out.println(e);
        }
    }
}
