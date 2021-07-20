package com.company;

class vehical {
    protected String brand = "Honda";

    public void honk() {
        System.out.println("tuut tuut!");
    }
}

class car extends vehical {
    public String model = "BMW";

    public void modelName() {
        System.out.println("This is my car!");
    }
}

public class inheritance_practice {
    public static void main(String[] args) {
        car myFirstCar = new car();
        myFirstCar.honk();
        System.out.println(myFirstCar.brand + " and " + myFirstCar.model);
    }
}
