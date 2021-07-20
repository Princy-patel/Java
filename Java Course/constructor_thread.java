package com.company;
class MyTHr extends Thread{
    public MyTHr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank You");
//        while (true){
//            System.out.println("I am Thread");
//        }
    }
}
public class constructor_thread {
    public static void main(String[] args) {
        MyTHr th1 = new MyTHr("Princy");
        MyTHr th2 = new MyTHr("Dharmik");
        th1.start();
        th2.start();
        System.out.println("The id of the Thread is " + th1.getId());
        System.out.println("The name of the Thread is " + th2.getId());
        System.out.println("The name of the Thread is " + th1.getName());
        System.out.println("The name of the Thread is " + th2.getName());
    }
}
