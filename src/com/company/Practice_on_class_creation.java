package com.company;

class Student{
//    String name;
    String Address;
    int roll_no;
    long phone_no;
}
public class Practice_on_class_creation {
    public static void main(String[] args) {
        //Problem 1.
        /*Student st = new Student();
        st.name = "John";
        st.roll_no = 233;
        System.out.println("The name is "+st.name+" and the roll no is "+st.roll_no);*/

        //Problem 2.
        Student Sam = new Student();
        Student John = new Student();

        //Setting Attributes for Sam.
        Sam.roll_no = 113;
        Sam.phone_no = 93003056;
        Sam.Address = "Sadak Para Kuthrel";

        //Setting Attributes for John.
        John.roll_no = 233;
        John.phone_no = 62631895;
        John.Address = "Gali No. 420";

        System.out.println("This is Sam's info:- ");
        System.out.println(Sam.Address);
        System.out.println(Sam.roll_no);
        System.out.println(Sam.phone_no);

        System.out.println("This is John's info:- ");
        System.out.println(John.Address);
        System.out.println(John.roll_no);
        System.out.println(John.phone_no);
    }
}
