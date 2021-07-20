package com.company;

interface Bicycle {
    public int a = 45;

    void ApplyBreak(int decrement);

    void SeepUp(int increment);
}

interface truck {
    void horn1();

    void horn2();
}

class AvonCycle implements Bicycle, truck {
    void horn() {
        System.out.println("pee pee poo poo");
    }

    public void ApplyBreak(int decrement) {
        System.out.println("Apply Break");
    }

    public void SeepUp(int increment) {
        System.out.println("Speed Apply");
    }

    public void horn1() {
        System.out.println("Please Horn Okay");
    }

    public void horn2() {
        System.out.println("Hey, Please horn me ");
    }
}

public class interfaces {
    public static void main(String[] args) {
        AvonCycle princy = new AvonCycle();
        princy.ApplyBreak(1);
        //You can crete properties in interface
        System.out.println(princy.a);

        //You cannot modify properties of in interfaces as they are final
        // princy. a = 454;
        //System.out.println(princy.a);

        princy.horn1();
        princy.horn2();
    }
}
