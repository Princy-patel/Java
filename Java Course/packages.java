package com.company;
import java.util.Scanner;
    import java.util.*;
public class packages {
    public static void main(String[] args) {
        // Use when we import Scanner
            Scanner sc = new Scanner(System.in);
            // java.util.Scanner sc = new java.util.Scanner(System.in); // Used when we import * package
        System.out.println("Enter your number : ");
            int a = sc.nextInt();
        System.out.println("This is my Scanner taking input " + a);
    }
}
