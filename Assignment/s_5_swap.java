package com.Assignment;

import java.util.Scanner;

public class s_5_swap {
    public static void main(String args[])
    {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Before swapping:");
        System.out.println("a = " +a +", b = " +b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping:");
        System.out.print("a = " +a +", b = " +b);
    }
}
