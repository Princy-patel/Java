package com.company;

public class exercise_2 {
    public static void main(String[] args) {
//      Problem 1
            String name = "Princy Patel";
            name = name.toLowerCase();
            System.out.println(name);

//      Problem 2
            String space = "Princy Patel";
            space = space.replace(" ","_");
            System.out.println(space);

//      Problem 3
            String letter = "Dear <|name|>, Thanks a lot!";
            letter = letter.replace("<|name|>", "Princy");
            System.out.println(letter);
    }
}
