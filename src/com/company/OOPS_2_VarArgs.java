package com.company;

public class OOPS_2_VarArgs {

    static int sum(int ...arr){
        // Available as int [] arr
        int result = 0;
        for (int each :
                arr) {
            result += each;
        }
        return result;
    }

    public static void main(String[] args) {
        /* VarArgs Tutorial */
        // Instead of making same functions with different arguments we can use varargs
        System.out.println("The sum of 3 and 5 is: " + sum(3, 5));
        System.out.println("The sum of the integers are: " + sum(1, 2, 43));
    }
}
