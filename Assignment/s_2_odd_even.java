package com.Assignment;
import java.util.Scanner;
public class s_2_odd_even {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("thh number is odd");
        }

    }
}
