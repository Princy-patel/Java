package com.company;

public class methods {
    //static int logic(int x, int y) { //It is the 1st type to introduced method
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    //If we any changes in methods do so the value in the main method will not be change.
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c;
        //Method invocation using method creation
        methods obj1 = new methods();
        c = obj1.logic(a, b);
        int a1 = 1;
        int b1 = 5;
        int c1;
        methods obj2 = new methods();
        c1 = obj2.logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }


}
