package com.company;

class Test {
    String name;
    int emp_id;

    public Test(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {
        Test t1 = new Test("Princy", 101);
        Test t2 = new Test("Dharmik", 102);
        System.out.println(t1.name + " " + t1.emp_id);
        System.out.println(t2.name + " " + t2.emp_id);
    }
}




