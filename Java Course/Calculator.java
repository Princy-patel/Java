package com.company;

import java.util.Scanner;

class calc {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Value: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd Value: ");
        int num2 = sc.nextInt();

        calc c = new calc();
        System.out.println(c.add(num1, num2));
        System.out.println(c.sub(num1, num2));
        System.out.println(c.mul(num1, num2));
        System.out.println(c.div(num1, num2));
    }
}