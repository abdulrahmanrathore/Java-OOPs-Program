package com.company;
import java.util.Scanner;

//class Subtract{
//    public int sub(int a, int b) {
//        int c = a + (~b+1);
//        return c;
//    }
//}
public class problem1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a +(~b+1); // Here I have converted b in
                            //one's complement and then from complement value
                            //I have grab negative number of b by adding 1 in (~b)
                            //i.e; 2's complement
        System.out.format("Subtraction of %d and %d is : %d",a,b,c);
//        Subtract s = new Subtract();
////        s.sub(5,3);
//        System.out.println("The Subtraction is: "+s.sub(5,3));

    }
}
