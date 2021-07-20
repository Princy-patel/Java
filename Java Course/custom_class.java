package com.company;

class Employee {
    int id;
    String name;
    int Salary;

    public void printdetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public  int getSalary(){
        return Salary;
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Employee obj = new Employee();
        Employee obj1 = new Employee();
        // Printing the  Attributes
        obj.id = 10;
        obj.Salary = 34;
        obj.name = "Princy";
        obj.printdetails();

        obj1.id = 12;
        obj1.Salary = 25;
        obj1.name = "Dharmik";
        obj1.printdetails();

        int Salary = obj1.getSalary();
        System.out.println(Salary);
        // System.out.println(obj.id);
        // System.out.println(obj.name);
    }
}
