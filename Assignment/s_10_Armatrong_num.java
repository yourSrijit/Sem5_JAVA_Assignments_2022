package com.Assignment;

import java.util.Scanner;

class  armstrong{
    public void isArmstrong(int x){
        int num =x;
        int result =0;
        int length = String.valueOf(num).length();
        while(x!=0){
            int r= x%10;
             result = (int) (result + Math.pow(r,length));
             x=x/10;
        }
        if(result ==num){
            System.out.println("This is a Atmstrong number");
        }
        else {
            System.out.println("Not a Armstrong number");
        }
    }
}

public class s_10_Armatrong_num {
    public static void main(String[] args) {
        armstrong ob=new armstrong();
        Scanner sc =new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        ob.isArmstrong(num);
    }
}
