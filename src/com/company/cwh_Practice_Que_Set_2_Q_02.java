/*Q.2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct
grade*/
package com.company;

public class cwh_Practice_Que_Set_2_Q_02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);
        //Decrypting the grade.
        grade = (char) (grade - 8);
        System.out.println(grade);

    }
}
