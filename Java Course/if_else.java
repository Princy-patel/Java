package com.company;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
//        int age = 18;
//        //boolean cond = (age == 18);
//        //if (cond) {
//
//
//        if(age>18){
//            System.out.println("You can drive!");
//        } else {
//            System.out.println("Sorry! You can not drive yet!");
//        }

        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter Your age:");
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are Experienced!");
        }else if (age>48){
            System.out.println("You are semi-experienced");
        } else if (age>30){
            System.out.println("You are semi-semi-experienced");
        }else {
            System.out.println("You are not experienced");
        }

    }
}
