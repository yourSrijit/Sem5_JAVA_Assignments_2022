package com.Assignment;

import java.util.Scanner;

public class s_4_Bitwise_operator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("Multiplication with 4 is "+(a<<2));
        System.out.println("Division with 2 is "+(a>>1));

    }
}
