package com.company;

public class OOPS_39_Finally_Block {
    public static int greet(){
        try{
            int a = 50, b =0;
            int c = a / b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
    }
}
