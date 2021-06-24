//Exercise 1.1
//Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken
//as input from the keyboard (marks are out of 100)

package com.company;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Enter the marks of 5 subject :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Subject 1 = ");
          float a = sc.nextFloat();
        System.out.print("Subject 2 = ");
          float b = sc.nextFloat();
        System.out.print("Subject 3 = ");
          float c = sc.nextFloat();
        System.out.print("Subject 4 = ");
          float d = sc.nextFloat();
        System.out.print("Subject 5 = ");
          float e = sc.nextFloat();
          float sum = a + b + c + d + e;
          float per = (sum/500)*100;
        System.out.print("So you made "+per+"% out of 100%");


    }
}
