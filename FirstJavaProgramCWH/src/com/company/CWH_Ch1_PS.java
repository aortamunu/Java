package com.company;
import java.util.Scanner;

public class CWH_Ch1_PS {
    public static void main(String[] args) {
//        Question 1 (WAP to sum 3 numbers in Java)
        /*int a = 47;
        int b = 59;
        int c = 26;

        int sum = a + b + c;
        System.out.println(sum);*/

        //Question 2 (WAP to CGPA using marks of three students)

       /* float m1 = 85;
        float m2 = 91;
        float m3 = 72;

        float cgpa = (m1 + m2 + m3)/30;
        System.out.println("CGPA is "+cgpa);*/

        //Question 3 (wAP which asks user to enter his/her name
        // and greets them with "Hello <name>, have a good day!" text.

       /* Scanner name = new Scanner(System.in);
        System.out.println("What's your name?");
        String n = name.nextLine();

        System.out.println("Hello "+n+", have a good day!");*/

        //Question 4 (WAP to converts kilometers into miles.)

        /*Scanner dc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometer.");
        double km = dc.nextFloat();
        double miles = km*0.621371;

        System.out.println(km+"km = "+miles+"miles");*/

        //Question 5 (WAP to detect whether a number entered by a user is integer or not.)

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number.");
        System.out.println(num.hasNextInt());
    }
}
