package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("Mai Parant naame ke class ka constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }

    @Override
    public void greet2(){
        System.out.println("Good morning");
    }
}
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class cwh_51_abstract_class {
    public static void main(String[] args) {
//        Parent p = new Parent();  -- error
        Child c = new Child();
//        Child2 c2 = new Child2();  -- error

    }
}
