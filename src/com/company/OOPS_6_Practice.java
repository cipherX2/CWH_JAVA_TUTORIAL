package com.company;

class MyEmployee {
    int salary;
    String name;

    public int get_salary() {
        return salary;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String newName) {
        name = newName;
    }
}

class CellPhone{

    public void cell_phone_ringing(){
        System.out.println("Pick up your phone It's been ringing.");
    }

    public void cell_phone_vibrating(){
        System.out.println("Your phone just got a message.");
    }

    public void call_a_friend(){
        System.out.println("Calling your friend cheems");
    }

}

class Square{
    int side;

    public int area_of_square(){
        int area = side * side;
        return area;
    }

    public int perimeter_of_square(){
        int perimeter = 4 * side;
        return perimeter;
    }

}


public class OOPS_6_Practice {
    public static void main(String[] args) {
        MyEmployee cipher = new MyEmployee();

        // Code 1
        cipher.name = "Blake Griffin";
        cipher.salary = 1000000;

        String name_of_cipher = cipher.get_name();
        System.out.println(name_of_cipher);

        int salary_of_cipher = cipher.get_salary();
        System.out.println("$" + salary_of_cipher);

        cipher.set_name("James Harden");
        System.out.println("New name is: " + cipher.get_name());

        // Code 2
        CellPhone samsung = new CellPhone();
        samsung.call_a_friend();
        samsung.cell_phone_ringing();
        samsung.cell_phone_vibrating();

        // Code 3
        Square my_square = new Square();
        my_square.side = 5;
        System.out.println("The area of the square is " + my_square.area_of_square());
        System.out.println("The perimeter of the square is " + my_square.perimeter_of_square());

    }
}
