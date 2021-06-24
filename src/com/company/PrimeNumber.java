package com.company;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the term as far as you want:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            int count = 0;
            for (int j=1; j<=i; j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count ==2){
                System.out.print(i+" ");
            }
        }
    }
}
