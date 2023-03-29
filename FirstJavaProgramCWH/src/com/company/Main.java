package com.company;
import java.util.Scanner;

class Sum{
    public static void main(String[] args){
        int a,b,c;
        Scanner num =  new Scanner(System.in);
        System.out.println("Enter first number.");
        a = num.nextByte();
        System.out.println("Enter second number.");
        b = num.nextByte();
        System.out.println("Enter third number.");
        c = num.nextByte();

        int sum3Num;
        sum3Num = a+b+c;

        System.out.println("The sum of three numbers that you provided is " +sum3Num);
    }
}