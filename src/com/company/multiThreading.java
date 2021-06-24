package com.company;

class a extends Thread{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("i="+i);
        }
    }
}
class b extends Thread{
    public void run(){
        for (int j=1; j<=5; j++){
            System.out.println("j="+j);
        }
    }
}
class c extends Thread{
    public void run(){
        for (int k=1; k<=5; k++){
            System.out.println("k="+k);
        }
    }
}
public class multiThreading {
    public static void main(String[] args) {
        new a().start(); //temporary object
        new b().start(); //temporary object
        new c().start(); //temporary object
    }
}
