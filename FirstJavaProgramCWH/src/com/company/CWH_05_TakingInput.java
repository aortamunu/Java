package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("It works");
        Scanner ss = new Scanner(System.in);
/*
        boolean b1 = ss.hasNextInt(); //checks if user provided number is integer or not
        System.out.println(b1);
        System.out.println("Enter your name."); //If input is Ram Thapa, only Ram will be printed.
        String str = ss.next();
        System.out.println(str);
*/
        System.out.println("Enter your name."); //It prints whole line even after space..
        String str = ss.nextLine();
        System.out.println(str);
    }
}
