package com.company;
/*
  Extending Interface:-
  ---------------------
  In the same way we extend a class, we can also extend an interface. It means that an interface
  can extend another interface.
  Syntax:-
  --------
  interface_name1 extends name2
  {
  body of name1;
  }
  Example:-
  interface abc
  {
  int code = 101;
  String str = "Anup";
  }

  interface xyz extends abc;
  {
  void display();
  }

  implementing Interface:-
  ------------------------
  Interface are actually made for performing the work of a super class. It is a way to implement
  multiple inheritance in Java.
  Syntax:-
  --------
  class class_name implements interface_name
  {
  body of the class;
  }
  class class_name extends superclass implements interface_name
  {
  body of the class;
  }
*/

interface area{
    float pi = 3.14f;
    float calculate(float x, float y);
}
class rectangle implements area{
    public float calculate(float x, float y){
        return x*y;
    }
}
class circle implements area{
    public float calculate(float x, float y){
        return pi*x*y;
    }
}

public class interfaces {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        circle cir = new circle();
        area a;
        a = rect;
        System.out.println("Area of Rectangle = " + a.calculate(10,20));
        a = cir;
        System.out.println("Area of Circle = "+ a.calculate(10,10));
    }
}
