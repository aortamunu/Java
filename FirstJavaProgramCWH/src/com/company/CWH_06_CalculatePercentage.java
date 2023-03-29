package com.company;
import java.util.Scanner;

public class CWH_06_CalculatePercentage {
    public static void main(String[] args) {
        //Taking Student's Name as input from user.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name.");
        String stdName = scn.nextLine();

        //Taking Student's Marks as input from user
        Scanner math = new Scanner(System.in);
        System.out.println("Enter the marks you obtained in Maths.");
        int markMath = math.nextInt();

        Scanner science = new Scanner(System.in);
        System.out.println("Enter the marks you obtained in Science.");
        int markScience = science.nextInt();

        Scanner english = new Scanner(System.in);
        System.out.println("Enter the marks you obtained in English.");
        int markEnglish = english.nextInt();

        Scanner nepali = new Scanner(System.in);
        System.out.println("Enter the marks you obtained in Nepali.");
        int markNepali = nepali.nextInt();

        Scanner computer = new Scanner(System.in);
        System.out.println("Enter the marks you obtained in Computer.");
        int markComputer = computer.nextInt();

        //Calculating percentage of the given marks
        int sum = markMath + markScience + markEnglish + markNepali + markComputer;
        int percentage = (sum*100)/500;
        System.out.println(percentage);

        System.out.println("Dear "+stdName+ ",");
        System.out.println("The total marks you obtained is "+sum);
        System.out.println("Congratulations, You scored "+percentage+"% in your exams.");
    }
}
