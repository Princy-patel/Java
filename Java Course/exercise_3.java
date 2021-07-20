package com.company;
import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Physics Marks:");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your Chemistry Marks:");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter your Maths Marks:");
//        m3 = sc.nextByte();
//
//        float avg = (m1 + m2 + m3)/3.0f;
//        System.out.println("Your Overall Marks: " + avg);
//
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulation! You are passed!");
//        } else {
//            System.out.println("Sorry! You ar failed");
//        }

//        Question 4
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Day:");
        day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }
    }
}
