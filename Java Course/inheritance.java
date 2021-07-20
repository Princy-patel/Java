package com.company;
class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm in Base class");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I'm Constructor");
    }
}
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I'm in Derived class");
        this.y = y;
    }
    public void print(){
        System.out.println("I'm another Constructor");
    }
}
public class inheritance {
    public static void main(String[] args) {
        // Creating an object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating an object of derived class for x
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());

        // Creating an object of derived class for y
        Derived d1 = new Derived();
        d1.setY(45);
        System.out.println(d1.getY());
    }
}
