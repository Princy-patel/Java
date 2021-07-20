package com.company;
class MyRunnableThread1 implements Runnable{
    public void run(){
        System.out.println("This is Thread 1 Runnable");
    }
}
class MyRunnableThread2 implements Runnable{
    public void run(){
        System.out.println("This is Thread 2 Runnable");
    }
}
public class runnable {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet1);
        gun1.run();
        gun2.run();
    }
}
