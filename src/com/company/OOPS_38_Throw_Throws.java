package com.company;

class MyAreaException extends Exception {
    @Override
    public String toString() {
        return "Negative radius doesn't exist....";
    }
}

public class OOPS_38_Throw_Throws {
    public static double area(int r) throws MyAreaException {
        if (r < 0) {
            throw new MyAreaException();
        }
        double area = Math.PI * Math.pow(r, 2);
        return area;

    }

    public static int divide(int a, int b) throws ArithmeticException {
        int lol = a / b;
        return lol;
    }

    public static void main(String[] args) {
//        try {
//            int result = divide(6, 0);
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println("Exception....");
//        }
        try {
            double result = area(-3);
            System.out.println(result);
        } catch (MyAreaException e) {
            System.out.println(e.toString());
        }

    }
}
