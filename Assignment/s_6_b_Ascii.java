package com.Assignment;

import java.util.Scanner;

public class s_6_b_Ascii {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a char ");
        char c=sc.next().charAt(0);
        int n=(int)c;
        System.out.println("so the ascii value of the char is "+n );
    }
}
