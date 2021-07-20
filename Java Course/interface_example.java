package com.company;

interface Camera {
    void takeSnap();

    void recordVideo();
    // We cannot override Private method.
    // Use : when default method ka logic bahot bada ho jata hai tab hum private method ko use kare sakte hai
    private void greet(){
        System.out.println("Good Morning...");
    }
    //Note:We can add default concrete method in java 8 and also we override this method
    default void record4kVideo() {
        greet(); //Like this
        System.out.println("Record 4k Video...");
    }
}

interface wifi {
    String[] getNetworks();

    void connectToNetwork(String networks);
}

class MyCellPhone {
    void ConnectCall(int phoneNumber) {
        System.out.println("Connecting..." + phoneNumber);
    }

    void PickCall() {
        System.out.println("PickUp the Call");
    }
}

class MySmartPhone extends MyCellPhone implements Camera, wifi {
    public void takeSnap() {
        System.out.println("Taking Sanp");
    }

    public void recordVideo() {
        System.out.println("Record the video");
    }

//    @Override
//    public void record4kVideo() {
//        System.out.println("Taking snap and then override the method");
//    }

    public String[] getNetworks() {
        System.out.println("List is below");
        String[] networkList = {"Princy", "Dharmik", "Krinal"};
        return networkList;
    }

    public void connectToNetwork(String networks) {
        System.out.println("The network string is " + networks);
    }
}

public class interface_example {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        //ms.greet(); // Throws an error because of private method
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
