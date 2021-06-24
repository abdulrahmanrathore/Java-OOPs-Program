package com.company;

import java.util.Scanner;
public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        int number, first_digit, last_digit;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number that you wish : ");
        number = sc.nextInt();

        first_digit = number;
        while(first_digit >= 10)
        {
            first_digit = first_digit / 10;
        }

        last_digit = number % 10;
        System.out.println("The First Digit of Entered number "+number+" is "+ first_digit+"\nAnd" +
                " The Last Digit of Entered number "+number+" is "+last_digit);
        System.out.println("The sum of "+first_digit+" and "+last_digit
                +" is : "+(first_digit+last_digit));
    }
}
