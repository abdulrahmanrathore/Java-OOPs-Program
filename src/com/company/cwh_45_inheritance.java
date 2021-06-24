package com.company;

class Base{         //Super class, Parent class, Base class.('Baap hai ye Derived ka').
   public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{    // sub-class, child class, derived class. ('Beta hai, putra hai ye Base naamak class ka')
    public int y;     // viraasat me mili hai isko 'Base' naam ke class ki property. Matalb apne baap se mila hai kuch gun isko bhi

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        //Creating an object of Base class.
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
//        b.setY(3);           --> It throws an error becozz Y is not a part of Parent class i.e; 'Base' class
//        System.out.println(b.getY());


        //Creating an object of derived class.
        Derived d = new Derived();
        d.setY(43); //--> Here we can use both X and Y becozz 'Derived' class got X from his Parent class
        System.out.println(d.getY());
        d.setX(44);
        System.out.println(d.getX());

    }
}
