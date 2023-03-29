package com.company;
import java.util.Scanner;
public class CWH_v12_q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        int a = input.nextInt();
        System.out.println(a>16);
        if(a>16) {
            System.out.println("The number you entered is greater than 16.");
        }
        else{
            System.out.println("The number you entered is less than 16.");
        }
    }
}
