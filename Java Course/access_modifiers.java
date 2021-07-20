package com.company;

class C1 {
    public int x = 5;
    protected int y = 10;
    int z = 50;
    private int a = 100;
    public void math1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        c.math1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); // Private is not use even in same package
    }
}
