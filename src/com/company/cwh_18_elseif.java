package com.company;
import java.util.Scanner;
public class cwh_18_elseif {
    public static void main(String[] args) {
        char var = 'r';

        switch (var) {
            case 'r' -> System.out.println("You are going to become an Adult!");
            case 'd' -> System.out.println("You are going to join a Job!");
            case 'e' -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my java code!");

        /*
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your Age");
        age = sc.nextInt();

        if(age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }
         */
    }
}
