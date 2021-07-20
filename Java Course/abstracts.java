package com.company;
// Abstract class and methods
abstract class Parent1{
    public Parent1(){
        System.out.println("I'm constructor of parent1 class");
    }
    public void Princy(){
        System.out.println("Hello Good Morning");
    }
    abstract public void greet();
}
class Child1 extends Parent1{
    @Override
    public void greet(){
        System.out.println("Good Morning guys");
    }
}
abstract class Child2 extends Parent1{
    public void princy2(){
        System.out.println("I am good");
    }
}
public class abstracts {
    public static void main(String[] args) {
        // Parent1 obj1 = new Parent1() --> Error We cannot create object of object class
        Child1 obj = new Child1();
        obj.greet();

    }
}
