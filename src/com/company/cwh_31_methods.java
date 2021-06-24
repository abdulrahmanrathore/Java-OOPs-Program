package com.company;

public class cwh_31_methods {
    //the method 1. with static. In static method we don't need to create an object.
    // we can simply call the method.
    static int logic(int x, int y){
        int z;
        if (x>y) {
            z = x+y;
        }
        else {
            z = (x + y) * 5;
        }
        x = 566;
        return z;
    }

      /*int logic(int x, int y){  //the method 2 without static. for we have to create object.
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }*/
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c;
        //Method invocation using object creations.
//      cwh_31_methods obj = new cwh_31_methods();  //this is object of method 2 without static.
//      c = obj.logic(a, b);  //calling method 2. with which we have created object(i.e; obj)
        c = logic(a, b);
        System.out.println(a+ " "+ b);


        int a1 = 2;
        int b1 = 1;
        int c1;
//        c1 = obj.logic(a1, b1);  //calling method 2. with which we have created object(i.e; obj)
        c1 = logic(a1, b1);  // calling static method (i.e; method 1)
        System.out.println(c);
        System.out.println(c1);
    }
}
