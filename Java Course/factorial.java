package com.company;
import java.util.Scanner;
public class factorial {
    static int fact = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int no = sc.nextInt();
        factorial fc = new factorial();
        fc.FactCalc(no);
        System.out.println("Your Result is : " +  fact);
    }
    void FactCalc(int no){
        if (no>=1){
            fact = fact * no;
            FactCalc(no-1);
        }
    }
}
