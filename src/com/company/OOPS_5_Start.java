package com.company;

// Creating custom class
class Employee {
    int id;
    int salary;
    String name;

    public void print_details() {
        System.out.println("My name is " + name);
        System.out.println("My id is " + id);
        System.out.println("My salary is " + salary);
    }

    public int get_salary(){
        return salary;
    }
}

public class OOPS_5_Start {

    public static void main(String[] args) {
        Employee cipher = new Employee(); // Instantiating a new Employee Object
        Employee bhoms = new Employee();

        cipher.id = 23;
        cipher.salary = 3400000;
        cipher.name = "Blake Griffin";

        bhoms.id = 7;
        bhoms.salary = 90000;
        bhoms.name = "Noomb cheems";

        cipher.print_details();
        bhoms.print_details();
        int cipher_salary = cipher.get_salary();
        System.out.println(cipher_salary);

    }
}
