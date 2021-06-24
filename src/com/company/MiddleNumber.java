package com.company;

import java.util.Scanner;
public class MiddleNumber {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();

        //checking n1 is a median  number or not
        if(n2>n1 && n1>n3 || n3>n1 && n1>n2){
            System.out.print(n1+" is a median number among "+n1+" "+n2+" "+" "+n3);
        }
        //checking n2 is a median  number or not
        else if(n1>n2 && n2>n3 || n3>n2 && n2>n1){
            System.out.print(n2+" is a median number among "+n1+" "+n2+" "+" "+n3);
        }
        //checking n3 is a median  number or not
        else if(n1>n3 && n3>n2 || n2>n3 && n3>n1){
            System.out.print(n3+" is a median number among "+n1+" "+n2+" "+" "+n3);
        }
    }
}
