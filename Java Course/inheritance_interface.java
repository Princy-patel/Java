package com.company;
interface sampleInterface{
    void math1();
    void math2();
}
interface childSampleClass extends sampleInterface{
    void math3();
    void math4();
}
class MySampleClass implements childSampleClass{
    public void math1(){
        System.out.println("math1");
    }
    public void math2(){
        System.out.println("math2");
    }
    public void math3(){
        System.out.println("math3");
    }
    public void math4(){
        System.out.println("math4");
    }
}
public class inheritance_interface {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.math1();
        msc.math2();
        msc.math3();
        msc.math4();
    }
}
