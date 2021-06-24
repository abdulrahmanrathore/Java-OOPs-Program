package com.company;

import java.util.Locale;

public class cwh_14_string_methods {
    public static void main(String[] args) {
        String name = "ABDUL RAHMAN";
        String name1 = "abdul rahman";
//        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name1.toUpperCase();
        //System.out.println(ustring);

        //String nonTrimmedString = "      Abdul       ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);
//
//        System.out.println(name.substring(1));
//        System.out.println(name.substring(1,5));
//
//        System.out.println(name.replace('A','e'));
//        System.out.println(name.replace("Rahman","ABDUL"));

        //System.out.println(name.startsWith("ABD"));
        //System.out.println(name.endsWith("N"));
        System.out.println(name.charAt(0));

        String modifiedName = "Harryrryrry";
        //System.out.println(modifiedName.indexOf("rry"));
        //System.out.println(modifiedName.indexOf("yrry",4));
        System.out.println(modifiedName.lastIndexOf("rry",7));

        //System.out.println(name.equals("ABDUL RAHMAN"));
        System.out.println(name.equalsIgnoreCase("AbDuL rAhMaN"));

        System.out.println("I am escape sequence \\ double quote");


    }
}
