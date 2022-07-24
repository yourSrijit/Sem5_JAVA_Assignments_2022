package com.Assignment;

import java.util.Scanner;

public class s_3_leap_year {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter tho year");
        int y=sc.nextInt();
        if(y%400==0 ||y%100!=0 && y%4==0){
            System.out.println("The year is leap year");
        }
        else {
            System.out.println("Enter year is not a leap year");
        }
    }
}
