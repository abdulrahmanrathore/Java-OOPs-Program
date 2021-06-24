package com.company;
class Student1{
    int roll;
    void getRoll(int n){
        roll = n;
    }
    void putRoll(){
        System.out.println("Roll= " + roll);
    }
}

class test extends Student1{
    float mark1,mark2;
    void getMarks(float m1, float m2){
        this.mark1 = m1;
        this.mark2 = m2;
    }
    void putMarks(){
        System.out.println("Marks1 = " + mark1 + "\nMarks2 = " + mark2);
    }
}

interface sports{
    float sport_mark = 6.0f;
    void putSport();
}

class result extends test implements sports{
    float total;
    public void putSport(){
        System.out.println("Sports Marks= " + sport_mark);
    }
    void display(){
        total = mark1 +mark2+sport_mark;
        putRoll();
        putMarks();
        putSport();
        System.out.println("Total Marks = " + total);
    }
}

public class multiple_inheritance_using_interfaces {
    public static void main(String[] args) {
        result aa = new result();
        aa.getRoll(101);
        aa.getMarks(30.5f,35.9f);
        aa.display();
    }
}
