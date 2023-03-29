package com.company;

public class CWH_v12_q2_encryptGrade {
    public static void main(String[] args) {
        /*
        Write a java program to encrypt a grade by adding 8 to it.
        Decrypt it to show the correct grade.
         */

        //Encryption
        char grade = 'B';
        grade = (char)(grade + 8); //Typecasting the resulting integer to character
        System.out.println(grade);

        //Decryption
        grade = (char)(grade - 8);
        System.out.println(grade);

    }
}
