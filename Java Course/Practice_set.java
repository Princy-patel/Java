package com.company;

class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class cellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Call Dhruvi...");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class pubg{

    public void fire(){
        System.out.println("I like PUBG");
        System.out.println("Firing on the enemy");
    }
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
}

public class Practice_set {
    public static void main(String[] args) {
        /*
        // Problem 1
        Employee1 princy = new Employee1();
        princy.setName("Princy Technical");
        System.out.println(princy.getName());
        princy.salary = 233;
        System.out.println(princy.getSalary());

        // Problem 2
        cellPhone miNote = new cellPhone();
        miNote.ring();
        miNote.vibrate();
        miNote.callFriend();

        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

         */

        // Problem 4
        pubg enemy = new pubg();
        enemy.fire();
        enemy.run();
        enemy.hit();
    }
}
