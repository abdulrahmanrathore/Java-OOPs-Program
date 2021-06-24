package com.company;
import java.util.Scanner;
public class Fibonacci_series {
    static int n1 =0, n2 =1, n3;
    static void fibonacci(int n){
        if (n>0){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
            fibonacci(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of element: " );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print( n1+" "+ n2);
        fibonacci(n);
    }
}
