package com.company;

interface Camera{
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

interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements Wifi,Camera{
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
public class cwh_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
//        ms.greet(); --> Throws an error!
        String[] ar = ms.getNetwork();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
