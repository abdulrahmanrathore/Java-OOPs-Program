package com.company;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}


class CallPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void CallFriend(){
        System.out.println("Calling Mukul...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int width;
    public int are(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }public void run(){
        System.out.println("Running from the enemy");
    }public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class cwh_39_practice_set_on_class {
    public static void main(String[] args) {
        /*
        // Problem 1
        Employee Abdul = new Employee();
        Abdul.setName("AbdulRahman");
        Abdul.salary = 233;
        System.out.println(Abdul.getSalary());
        System.out.println(Abdul.getName());

        //Problem 2
        CallPhone asus = new CallPhone();
        asus.CallFriend();
        asus.vibrate();
        asus.ring();



        //Problem 3.
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //Problem 4.
        Rectangle rec = new Rectangle();
        rec.length = 4;
        rec.width = 3;
        System.out.println(rec.are());
        System.out.println(rec.perimeter());*/

        //Problem 5.
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
