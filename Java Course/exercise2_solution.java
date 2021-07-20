package com.company;


import java.util.Random;
import java.util.Scanner;

public class exercise2_solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 for Rock, 1 for Paper and 2 for Scissor");
        System.out.println("Enter Your Choice: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer Win!");
        }
        //System.out.println("Computer Choice " + computerInput);
        if (computerInput == 0) {
            System.out.println("Computer Choice: Rock");
        } else if (computerInput == 1) {
            System.out.println("Computer Choice: Paper");
        } else {
            System.out.println("Computer Choice: Scissor");
        }
    }
}
