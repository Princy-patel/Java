package com.company;
// 1. Crate class circle and use inheritance to create another class Cylinder from it.
class Circle{
    public int radius;
    Circle(){
        System.out.println("I'm non parametrized constructor");
    }
    Circle(int r){
        System.out.println("I'm parametrized Constructor");
       this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I'm Cylinder1 Constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class practice_set_with_solution {
    public static void main(String[] args) {
        // Problem 1
        Circle obj1  = new Circle(12);
        System.out.println(obj1.area());
        Cylinder1 obj = new Cylinder1(12,18);
        System.out.println(obj.volume());
    }
}
