package com.company;

public class recursion {
    // factorial(0) = 1
    // factorial(n) = n * n-1 * ... 1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) { // 1 to n
            product = product * i;
        }
        return product;
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println("The value of x is: " + factorial(x));
        int y = 5;
        System.out.println("The value of x is: " + factorial_iterative(y));

    }
}
