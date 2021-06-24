package com.company;

import java.util.Scanner;
public class Calculation_of_Total_Amount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();
        double total_Amount = 0;
        System.out.print("Enter the Deposit amount: ");
        int deposit = sc.nextInt();
        System.out.print("Enter the Interest at 9% : ");
        float I = sc.nextFloat();
        if (year==1&&deposit==10000){
            total_Amount = 10000*0.09+deposit+I;
        }
        else if (year==2&&deposit==11000){
            total_Amount = (10900+11000)*0.09+deposit+I;
        }
        else if (year==3&&deposit==12100){
            total_Amount = (35971+3237)*0.09f+deposit+I;
        }
        System.out.println("The total amount is: "+total_Amount);
    }
}
