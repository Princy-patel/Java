package com.company;

class Cylinder {
    private int radius;
    private int height;
    /*
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    */

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI  * radius * height; // Here we can use 3.14 instead of Math.PT
    }

    public double volume() {
        return Math.PI  * radius * radius * height; // Here we can use 3.14 instead of Math.PT
    }

}

class Recangle{
    private int length;
    private int breath;

    public Recangle(){
        this.length = 4;
        this.breath = 5;
    }

    public Recangle(int length, int breath){
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}

public class prectice_access_modifier {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();

        // Problem 1
        /*
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */

        // Problem 3
        Recangle r = new Recangle(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreath());
    }

}

