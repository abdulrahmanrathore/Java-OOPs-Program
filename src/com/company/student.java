package com.company;

public class student {
    int roll;
    String name;
    static String Cname = "CSIT COLLEGE"; //Static data member.
    student(int x, String y){
        roll = x;
        name = y;
    }
    void display(){
        System.out.println("Roll= "+roll+" Name= "+ name+" College Name= " +Cname);
    }
}
class Demo{
    public static void main(String[] args) {
        student aa =new student(101, "Rohan");
        student bb =new student(102, "Mukul");
        aa.display();
        bb.display();
    }
}
