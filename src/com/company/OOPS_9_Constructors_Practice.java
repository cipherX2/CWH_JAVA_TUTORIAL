package com.company;

import java.util.Scanner;

class Cylinder{
    float radius, height;
    double surfaceArea, volume;

    public void setRadius(float rad){
        this.radius = rad;
    }

    public float getRadius(){
        return this.radius;
    }

    public void setHeight(float heightt){
        this.height = heightt;
    }

    public float getHeight(){
        return this.height;
    }

    public double getSurfaceArea(){
        this.surfaceArea = 2*3.14*radius*(height + radius);
        return surfaceArea;
    }

    public double getVolume(){
        this.volume = 1.33*3.14*(Math.pow(radius, 3));
        return volume;
    }


}

public class OOPS_9_Constructors_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cy = new Cylinder();

        System.out.println("Enter the height and radius of the cylinder: ");
        cy.setRadius(sc.nextFloat());
        cy.setHeight(sc.nextFloat());

        System.out.println("Radius: " + cy.getRadius());
        System.out.println("Height: " + cy.getHeight());

        System.out.println("Surface Area: " + cy.getSurfaceArea());
        System.out.println("Volume: " + cy.getVolume());

    }
}
