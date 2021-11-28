package com.company;

class Rectangle {
    int length, width;

    Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    int getArea() {
        return this.length * this.width;
    }

}

class Cuboid extends Rectangle {
    int height;

    Cuboid(int l, int w, int h) {
        super(l, w);
        this.height = h;
    }

    int getArea() {
        return 2 * ((length * width) + (length * height) + (height * width));
    }

}

public class OOPS_16_Practice {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(2,3);
        int area = obj1.getArea();
        System.out.println("Area: " + area);

        Cuboid ip = new Cuboid(1,2,3);
        int cuboid_area = ip.getArea();
        System.out.println("Area: " + cuboid_area);

    }
}
