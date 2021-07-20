package com.company;

public class try_catch_deepaksir {
    public static void main(String[] args) {
        try{
            int a = 100, b = 0, c;
            c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("I'm finally");
        }
        System.out.println("Hello World!");
    }
}
