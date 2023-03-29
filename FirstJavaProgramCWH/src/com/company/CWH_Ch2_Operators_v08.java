package com.company;

public class CWH_Ch2_Operators_v08 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2 + a; //+ is an arithmetic operator whereas = is an assignment operator.
        // here '2+a' is assigned to variable b.
        //Arithmetic operators cannot work with booleans. (1+true)??? <--doesn't work
        //%(modulo operator) operator can work on floats and doubles.
        System.out.println(b);
        int c = 4;
        c +=5; //c+=5 <--- c = c + 5, assignment operator
        System.out.println(c);

        // = <-- assignment operator
        //== <-- comparison operator

        //Bitwise operator
        System.out.println(5&4);
        // 5 <-- 101
        // 4 <-- 100
        //     -------
               //100 (1&1=1, 0&0=0, 1&0=0)
    }
}
