package com.company;
public class CWH_04_literals {
    public static void main(String[] args) {
        //integral data types
        byte age = 25;
        System.out.println(age);
        long ages= 763782989203L;
        int age1 = 78;
        short age2 = 68;
        //floating point literals
        float f1 = 39.84f;
        float f11 = 53.38F; //f or F must be added to make decimal number a floating point literal.
        double d1 = 5734.23492; // d or D can be added but
        double d11 = 5613.85454d; //it is not required as DOUBLE is default type for decimal numbers
        double d111 = 54156.585646D;

        boolean a = true;
        char ch = 'S'; //character is written inside 'single quote'
        String str = "Seemana"; //String is written inside "double quote"
    }
}
