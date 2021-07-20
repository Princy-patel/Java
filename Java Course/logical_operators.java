package com.company;

public class logical_operators {
    public static void main(String[] args) {
        System.out.println("For Logcal AND...");
        boolean a = true;
        boolean b = false;

        if(a && b){
            System.out.println("You are Right");
        } else {
            System.out.println("Hey! You are Wrong");
        }

        System.out.println("-----------------------------------");

        System.out.println("For Logical OR...");
        boolean a1 = true;
        boolean b1 = false;

        if(a1 || b1){
            System.out.println("You are Right");
        } else {
            System.out.println("Hey! You are Wrong");
        }

        System.out.println("-----------------------------------");

        System.out.println("For Logical NOT...");
        boolean a2 =false;
        boolean b2 = true;

        System.out.print("Not(a2) is : ");
        System.out.println(!a2);
        System.out.print("Not(b2) is : ");
        System.out.println(!b2);


    }
}
