package com.company;

public class varags {
//    static  int sum(int a, int b){
//        return  a+ b;
//    }
//    static  int sum(int a, int b, int c){
//        return a + b + c;
//    }
    //static int sum(int x, int ...arr){     // If we want to do compulsory one argument.
    static int sum(int ...arr){
        // int result = x;      // If we want to do compulsory one argument.
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of nothing: " + sum());
        System.out.println("The value of 4  and 5 is: " + sum(4,5));
        System.out.println("The value of 4, 5 and 9 is: " + sum(4,5,9));
        System.out.println("The value of 1,4,5 and 20 is: " + sum(1,4,5,20));
    }
}
