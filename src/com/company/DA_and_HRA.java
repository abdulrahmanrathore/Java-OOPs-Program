package com.company;

import java.util.Scanner;
public class DA_and_HRA {
    public static void main(String[] args) {
        float salary, da=0, hra=0;
        System.out.println("Enter basic salary of an employee");
        Scanner sc = new Scanner(System.in);
        salary = sc.nextInt();
        //Calculating DA and HRA according to given condition.
        if (salary<=2000){
            da = salary*0.1f;
            hra = salary*02f;
        }
        else if(salary>2000&&salary<=5000){
            da = salary*0.2f;
            hra = salary*0.3f;
        }
        else if (salary>5000&&salary<=10000){
            da = salary*0.3f;
            hra = salary*0.4f;
        }
        else if (salary>10000){
            da = salary*0.5f;
            hra = salary*0.5f;
        }
        System.out.println("The DA is: "+da);
        System.out.println("The HRA is: "+hra);
    }
}
