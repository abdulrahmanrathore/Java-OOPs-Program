package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;

        while (true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
        }
    }
}
public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        //Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Abdul1");
        MyThr1 t2 = new MyThr1("Abdul2");
        MyThr1 t3 = new MyThr1("Abdul3");
        MyThr1 t4 = new MyThr1("Abdul4");
        MyThr1 t5 = new MyThr1("Abdul5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
