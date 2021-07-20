package com.company;

public class break_continue {
    public static void main(String[] args) {
//        For loop with break
//        for (int i = 0; i<= 5; i++){
//            System.out.println(i);
//            System.out.println("Java is great!");
//            if (i == 2){
//                System.out.println("End the loop");
//                break;
//            }
//        }
//        System.out.println("Actual end of the loop is here");
//        int i = 0;
//        while (i<5){
//            System.out.println(i);
//            System.out.println("Java is actually great");
//            if (i == 2){
//                System.out.println("End the loop");
//                break;
//            }
//            i++;


        for (int i = 0; i<=5; i++){
            if (i == 2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java i also Great!");

        }
    }
}
