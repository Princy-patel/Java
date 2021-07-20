package com.company;

class MyThread1 extends Thread{
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }


    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        MyThread2 bullet2 = new MyThread2();

        bullet1.start();
        bullet2.start();
    }
}
