package com.company;

import java.util.Scanner;

class employeee{
    float hr_pay;
    int hr_reg;
    int hr_over;
    double week_salary;
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the working hour : ");
        hr_reg = sc.nextInt();
        System.out.println();

        System.out.print("Enter the per hour payment : ");
        hr_pay = sc.nextFloat();
        System.out.println();

        System.out.print("Enter the Overtime hour : ");
        hr_over = sc.nextInt();
    }

    public void calculate(){
        if (hr_reg>8.0f){
            week_salary = 8.0f*500 + 1.5*500*(hr_reg-8.0f);
        }
        else {
            week_salary = hr_reg*500;
        }
    }
    public void Display(){
        System.out.println("The weekly salary of Employee is: $" + week_salary);
    }
}
public class Drive {
    public static void main(String[] args) {
        employeee em = new employeee();
        em.getData();
        em.calculate();
        em.Display();

    }
}
