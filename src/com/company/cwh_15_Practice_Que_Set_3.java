package com.company;

public class cwh_15_Practice_Que_Set_3 {
    public static void main(String[] args) {
        //Problem 1.
        //String name = "Jack Parker";
        //name = name.toLowerCase();
        //System.out.println(name);

        //Problem 2
        //String text = "To my friend ";
        //text = text.replace(" ","_");
        //System.out.println(text);

        //Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Abdul Rahman");
        System.out.println(letter);

        //Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("  "));

        //Problem 5
        String letter2 = "Dear Harry,\n\tThis Java course is Nice.\nThanks!";
        System.out.println(letter2);


    }
}
