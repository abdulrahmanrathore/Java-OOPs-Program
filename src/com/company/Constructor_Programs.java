package com.company;
import java.util.Scanner;
class add{
    int a;
    int b;
    add(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b =  sc.nextInt();

    }
    //    void setInput(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        a = sc.nextInt();
//        System.out.println("Enter second number");
//        b = sc.nextInt();
//    }
    void getOutput(){
        System.out.println("The sum is: " + (a+b));
    }
}
public class Constructor_Programs {
    public static void main(String[] args) {
//        aa.setInput();
        add aa = new add();
          aa.getOutput();
    }
}
