package com.company;

public class CWH_Ch2_Operators {
    public static void main(String[] args) {
        //1. Arithmetic Operator
        int a = 4;
        // int b = 6 % a;  // Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder

        //2. Assignment operator
        int b =9;
        b *= 3;
        System.out.println(b);
        //3. comparison operator
 //       System.out.println(6==6);
 //       System.out.println(64<6);
 //       System.out.println(64>5 && 64>98);  //&&(AND)logical operator
        System.out.println(64>5 || 64>98);  //||(OR)logical operator
        //4 Bitwise operator
        System.out.println(2&3);  //(&)

    }
}
