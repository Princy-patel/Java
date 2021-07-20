package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        age = sc.nextInt();
        //Variable can be string, integer or character in java
        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to join job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Dear, Enjoy your Life!");
        }
        System.out.println("Hey, Thanks for using our Java Code");
    }
}
