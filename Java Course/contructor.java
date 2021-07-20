package com.company;

class myMainEmployee {
    private int id;
    private String name;

    public void setId(int i) {

        id = i;
    }

    public int getId() {

        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;

    }

    public myMainEmployee() {
        id = 23;
        name = "Your-Name";
    }

    public myMainEmployee(String myName, int myId) {
        id = myId;
        name = "myName";
    }
}

public class contructor {
    public static void main(String[] args) {
        myMainEmployee princy = new myMainEmployee("Princy", 233);
        myMainEmployee princy1 = new myMainEmployee();
        System.out.println(princy.getId());
        System.out.println(princy.getName());
        System.out.println("__________________________________________");
        System.out.println(princy1.getId());
        System.out.println(princy1.getName());
    }
}
