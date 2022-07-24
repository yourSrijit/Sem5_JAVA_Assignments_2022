package com.Assignment;

import java.util.Scanner;

public class s_8_Prime_Num {
    public boolean isprime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st number");
        n1=sc.nextInt();
        System.out.println("Enter the 2nd number");
        n2=sc.nextInt();
        System.out.println("So the prime number between "+ n1 +" and "+n2 +" is");
        s_8_Prime_Num ob=new s_8_Prime_Num();
        for(int i=n1;i<=n2;i++){
            if(ob.isprime(i)){
                System.out.println(i +" ");
            }
        }
    }
}
