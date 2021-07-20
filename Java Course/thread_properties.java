package com.company;
class Thre1 extends Thread{
    public Thre1(String name){
        super(name);
    }
    public void run(){
        int i = 45;
        System.out.println("Thank You" + this.getName()) ;
    }
}
public class thread_properties {
    public static void main(String[] args) {
        Thre1 th1 = new Thre1(" Princy");
        Thre1 th2 = new Thre1(" Patel");
        Thre1 th3 = new Thre1(" Hello");
        Thre1 th4 = new Thre1(" All");
        Thre1 th5 = new Thre1(" All (Most Important)");
        th5.setPriority(Thread.MAX_PRIORITY);
        th1.setPriority(Thread.MIN_PRIORITY);
        th4.setPriority(Thread.NORM_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
