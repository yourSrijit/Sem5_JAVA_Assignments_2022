package com.Assignment.naturalNum;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper limit");
        n=sc.nextInt();
        sum ob=new sum();
        ob.sum1(n);
    }
}
