package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Value:");
//        int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter the Second Value");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
//        int sum = a+b;
        float sum = a + b;
        System.out.println("The Total value is: " + sum);

////        String str = sc.next();
//        String str = sc.nextLine();
//        System.out.println(str);
    }
}
