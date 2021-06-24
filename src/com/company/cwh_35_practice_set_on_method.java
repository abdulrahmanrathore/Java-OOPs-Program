package com.company;
import java.util.Scanner;
public class cwh_35_practice_set_on_method {
    /*static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+(i*n));
        }
    }*/

    static void pattern1(int n){
        for (int i=0; i<=n; i++){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumRek(int n){
        if(n==1){
            return 1;
        }
        return n + sumRek(n-1);
    }
    static void pattern2(int n){
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        /*if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }*/
        if (n==1 || n==2){
            return n-1;
        }
        else{
          return fib(n-1) + fib(n-2);
        }
    }
    static void pattern1_rec(int n){
        if (n>0){
            pattern1_rec(n-1);
            for (int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2_rec(int n){
        if (n>0){
            pattern2_rec(n-1);
            for (int i=n; i>0; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem 1.
//        int x = sc.nextInt();
//        System.out.print("Enter the number:");
//        System.out.println("The table is :-");
//        multiplication(x);
        //Problem 2.
//        int x = sc.nextInt();
//        pattern1(x);

        //Problem 3.
//        int c = sumRek(4);
//        System.out.println(c);


        //Problem 4.
//        System.out.print("Enter the nth term: ");
//        int x = sc.nextInt();
//        int result = fib(x);
//        System.out.println("The fibonacci series of "+x+"th term is: "+result);

        //Problem 5.
//        int x = sc.nextInt();
//        pattern1_rec(x);

        //Problem 6.
        int x = sc.nextInt();
        pattern2_rec(x);


    }
}