package com.company;

class AllEmployee{
    private int id;
    private String name;

    public String get_name(){
        return name;
    }

    public void set_name(String n){
        // name = n;
        this.name = n;
    }

    public int get_id(){
        return id;
    }

    public void set_id(int i){
        // id = i;
        this.id = i;
    }

}

class MyCircle{
    private float radius;
    private double area;
    private double perimeter;

    public void setRadius(float n){
        this.radius = n;
    }

    public void setArea(){
        this.area = 3.14*radius*radius;
    }

    public double getArea(){
        return area;
    }

    public void setPerimeter(){
        this.perimeter = 2*3.14*radius;
    }

    public double getPerimeter(){
        return perimeter;
    }

}

public class OOPS_7_AccessModifiers {
    public static void main(String[] args) {
        AllEmployee cipher = new AllEmployee();
        MyCircle lol = new MyCircle();
        //cipher.id = 23;
        //cipher.name = "CipherChuck"; ---> Throws an err due to private access modifier/specifier.

        cipher.set_name("cipher23");
        System.out.println(cipher.get_name());

        lol.setRadius(3.45f);
        lol.setArea();
        lol.setPerimeter();

        System.out.println("The area of circle is: " + lol.getArea());
        System.out.println("The perimeter of circle is: " + lol.getPerimeter());
    }
}
