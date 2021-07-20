package com.company;
class Base1{
    Base1(){
        System.out.println("I'm a Base1 class constructor");
    }
    Base1(int a){
        System.out.println("I'm an overloaded class constructor with value a as: " + a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(23);
        System.out.println("I'm a Derived1 class constructor");
    }
    Derived1(int a, int b){
        super(a);
        System.out.println("I'm a overloaded constructor with value of b: " + b);
    }
}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I'm a childOfDerived class constructor");
    }
    childOfDerived(int a, int b, int c){
        super(a,b);
        System.out.println("I'm a overloaded constructor with value of c: " + c);

    }
}
public class constructor_inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(15,10);
        childOfDerived cd = new childOfDerived(2,3,5);
    }
}
