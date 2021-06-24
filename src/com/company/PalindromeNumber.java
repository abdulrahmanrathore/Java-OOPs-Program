package com.company;

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] Sir_Majaa_Aa_Rha_Hai) {
        Scanner sc = new Scanner(System.in);
        int n, rev = 0, z;
        System.out.println("Enter Number to be check: ");
        n = sc.nextInt();
        z=n;
        //checking number reverse or not
        while (n>0){
            rev = (rev*10)+n%10;
            n = n/10;
        }
        if (rev==z){
            System.out.println(n+" is Palindrome");
        }
        else {
            System.out.println(n+" is not Palindrome");
        }
    }
}
