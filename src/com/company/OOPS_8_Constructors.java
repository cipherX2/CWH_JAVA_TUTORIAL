package com.company;

class MyMainEmployee {
    private int id;
    private String name;

    public String get_name() {
        return name;
    }

    public void set_name(String n) {
        // name = n;
        this.name = n;
    }

    public int get_id() {
        return id;
    }

    public void set_id(int i) {
        // id = i;
        this.id = i;
    }

    // Constructors support method overloading

    public MyMainEmployee(){
        id = 12;
        name = "Your-name-here";
    }

    public MyMainEmployee(String my_name, int my_id){
        id = my_id;
        name = my_name;
    }

}

public class OOPS_8_Constructors {
    public static void main(String[] args) {
        MyMainEmployee cipher = new MyMainEmployee("Ciphering", 12);
        MyMainEmployee harry = new MyMainEmployee();

        System.out.println(cipher.get_id());
        System.out.println(cipher.get_name());

        System.out.println(harry.get_id());
        System.out.println(harry.get_name());

    }
}
