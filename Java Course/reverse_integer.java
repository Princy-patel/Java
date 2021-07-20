package com.company;

public class reverse_integer {
    public static void main(String[] args) {
        int no = 54321, rev = 0, rem;
        while (no != 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }
        System.out.println(rev);
    }
}
