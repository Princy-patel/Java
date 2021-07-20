package com.company;
interface Camera2 {
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

interface wifi2 {
    String[] getNetworks();
    void connectToNetwork(String networks);
    void Network();
}

class MyCellPhone2 {
    void ConnectCall(int phoneNumber) {
        System.out.println("Connecting..." + phoneNumber);
    }

    void PickCall() {
        System.out.println("PickUp the Call");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements Camera2, wifi2 {
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
    public void Network(){
        System.out.println("This is Network");
    }

}
public class polymorphism {
    public static void main(String[] args) {
        Camera2 cam1 = new  MySmartPhone2();
        cam1.record4kVideo();
        cam1.takeSnap();
        //cam1.Network(); Not Allow because of refrence is camera interface
        MySampleClass cam2 = new MySampleClass();
    }
}
