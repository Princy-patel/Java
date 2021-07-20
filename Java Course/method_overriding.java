package com.company;
class A{
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I'm method 1 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){

        System.out.println("I'm method 1 of class B");
    }
    public void meth3(){
        System.out.println("I'm method 2 of class B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.meth2();

        A obj2 = new A();
        obj2.meth2();
    }
}
