package com.company;

import java.lang.Math;

class Circle {
    double radius;

    Circle(int r){
        this.radius = r;
    }

    public void print_detail() {
        System.out.println("Hi! I am circle");
    }

    public double getArea() {
        return 3.14 * Math.pow(this.radius, 2);
    }
}

class MyCylinder extends Circle {
    double height;

    MyCylinder(int radius, int h){
        super(radius);
        this.height = h;
    }

    @Override
    public void print_detail() {
        System.out.println("Hi! I am cylinder");
    }

    public double getVolume(){
        return 3.14 * Math.pow(this.radius, 2) * height;
    }
}

public class OOPS_15_Practice {
    public static void main(String[] args) {
        Circle obj1 = new Circle(12);
        double circle_area= obj1.getArea();
        System.out.println("Area: " + circle_area);

        MyCylinder obj2 = new MyCylinder(2, 3);
        double cylinder_area = obj2.getVolume();
        System.out.println("Volume: " + cylinder_area);
    }
}
