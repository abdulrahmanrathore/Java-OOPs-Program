package com.company;

public class cwh_24_break_and_continue {
    public static void main(String[] args) {
        //Break and continue using loops!
//        for (int i=0; i<50; i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i==2){
//                System.out.println("Ending the the loop");
//                break;
//            }
//        }
//        System.out.println("Loop ends here");

//        int i=0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i==2){
//                System.out.println("Ending the the loop");
//                break;
//            }
//            i++;
//        }while (i<5);
//        System.out.println("Loop ends here");





        //Continue
//                for (int i=0; i<50; i++){
//
//            if (i==2){
//                System.out.println("Ending the the loop");
//                continue;
//            }
//                    System.out.println(i);
//                    System.out.println("Java is great");
//        }


        int i=0;
        do {
            i++;
            if (i==2){
                System.out.println("Ending the the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while (i<5);
        System.out.println("Loop ends here");
    }
}
