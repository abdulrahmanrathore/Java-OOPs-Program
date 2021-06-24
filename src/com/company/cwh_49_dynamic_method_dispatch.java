package com.company;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
    public void on(){
        System.out.println("Turning on Smart Phone...");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();  //Allowed
//        SmartPhone smobj = new SmartPhone(); //Allowed
//        obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
//        SmartPhone obj2 = new Phone(); //not allowed

        obj.greet();
        obj.on();
    }
}
