package com.company;

interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface Wifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements Wifi2,Camera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    //    public void record4KVideo(){
//        System.out.println("Taking snap and recording in 4k");
//    }
    public String[] getNetwork(){
        System.out.println("Getting List of Network");
        String[] networkList = {"Harry", "Prashant", "Anjali56"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class cwh_59_polymorphism {
    public static void main(String[] args) {
        Camera2 cam1 = new MySmartPhone2(); //This is smartphone but, use it  as a camera
//        cam1.getNetwork();  --> Not allowed
        cam1.record4KVideo();
    }
}
