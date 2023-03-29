package com.company;

public class CWH_v13_ch3_Strings {
    public static void main(String[] args) {
       /* String name = new String("Seemana"); //String is a class, new object of string can be created.
        System.out.println(name);*/

        //String is a class but can be used as primitive datatype because string has special support in JAVA.
        String name = "Seemana";
        System.out.println(name);
        System.out.println(name.replace('a','i'));
        System.out.println(name.replace("Seem","Beem"));
        System.out.println("I am Seemana \f blah haha");
    }
}
