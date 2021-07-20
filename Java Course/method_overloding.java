package com.company;

public class method_overloding {
    static void change(int a) {
        a = 48;
    }

    static void change2(int[] arr) {
        arr[0] = 95;
    }
    // Method Overloding
    static void foo(){
        System.out.println("Hello, Good Morning!");
    }

    static void foo(int a){

        System.out.println("Good Morning " + a + " Sister");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " " + b + " Sister");
    }
    static void telljoke() {
        System.out.println("Hear about the new restaurant called Karma?\n" +
                "There’s no menu: You get what you deserve.");
    }

    public static void main(String[] args) {
        //telljoke();
        // Case 1: changing the Integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x is change after running is: " + x);

        //Case 2 : changing the array
        // int[] marks = {52, 72, 85, 96, 45};
        // change2(marks);
        // System.out.println("The value after changing is: " + marks[0]);

        // Method Overloding
        foo();
        foo(3000);
        foo(3000,40000);
    }
}
