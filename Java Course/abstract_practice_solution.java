package com.company;

abstract class pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends pen {
    void write() {
        System.out.println("Write");
    }

    void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Change the Nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Jumping...");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello Sir!");
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping..");
    }
}

public class abstract_practice_solution {
    public static void main(String[] args) {
        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human princy = new Human();
        princy.eat();

        // Q5
        Monkey m1 = new Human();
        // m1.speak(); --> Not Allow

        BasicAnimal m2 = new Human();
        // m2.speak(); --> Not Allow
        m2.eat();
        m2.sleep();
    }
}
