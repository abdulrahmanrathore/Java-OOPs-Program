/*Q.3. Use comparison operator to find out whether a given number is greater than the user entered
 number or not.*/
package com.company;
import java.util.Scanner;
public class cwh_Practice_Que_Set_2_Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a>8);
        float v = sc.nextFloat();
        float u = sc.nextFloat();
        float a = sc.nextFloat();
        float s = sc.nextFloat();
        float r = (v*v- u*u)/2*a*s;
        System.out.println(r);
    }
}
