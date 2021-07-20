package com.company;
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("The Phone is on");
    }
}
class smartPhone extends  Phone{
    public void on(){
        System.out.println("The SmartPhone is on");
    }
    public void music(){
        System.out.println("The music is on");
    }
}
public class method_dispatch {
    public static void main(String[] args) {
        //smartPhone obj = new smartPhone(); //Allowed
        //obj.on(); //Allowed
        //obj.music(); //Allowed

        //his is called method dispatch
        // Superclass obj = new Subclass
        Phone obj1 = new smartPhone(); // Yes,This is Allowed
        obj1.on(); //Allowed
        // obj1.music(); //Not Allowed

        // Subclass obj = new superclass // not allowed
    }
}
