package com.company;

public class cwh_26_arrays {
    public static void main(String[] args) {
        /*Class of 500 students - You have to store marks of these 500 students.
        You have 2 option:
        1. Create 500 variables
        2. Use Arrays(recommended)
         */

        //There are three main ways to create an array in Java
        //1. Declaration and memory allocation
        //int [] marks = new int[5]; →→→→→ Declaration + Memory Allocation

        //2. Declaration and then memory allocation
        /*int[]marks;          →→→→    Declaration
        marks = new int[5];    →→→→    Memory Allocation
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        marks[4] = 96;
        // marks[5] = 96; - throws an error
        System.out.println(marks[4]);
         */

        //3. Declaration, memory allocation and initialization together
        int[] marks = {100,70,80,71,98};
        System.out.println(marks[4]);
    }
}
