package com.company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double Volume(){
        return Math.PI* radius * radius*height;
    }
}

// Problem 5.
class Sphere{
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4 * Math.PI * radius * radius ;
    }
    public double Volume(){
        return 1.33333333 * Math.PI * radius * radius*radius;
    }
}

//Problem 4.
class Ractangle{
    private int length;
    private int breadth;

    public Ractangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Ractangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class cwh_43_practice_set_9 {
    public static void main(String[] args) {

        // Problem 1.
        System.out.print("Cylinder -->");
        Cylinder myCylinder = new Cylinder(9,12);
//        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
//        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        //Problem 2.
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.Volume());


        // Problem 4.
        System.out.print("Rectangle -->");
        Ractangle r = new Ractangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());


        //Problem 5.
        System.out.println("Sphere -->");
        Sphere s = new Sphere(12);
        s.setRadius(13);
        System.out.println(s.getRadius());
        System.out.println(s.surfaceArea());
        System.out.println(s.Volume());









    }
}
