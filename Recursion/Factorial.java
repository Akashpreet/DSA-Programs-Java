// package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        // if(n==0 || n==1){
        //     return 1;
        // }
        // int fa=fact(n-1);
        // int fan=n*fa;
        // return fan;
        if(n==1 || n==0){
            return 1;
        }
        int fac=fact(n-1);
        int fa=n*fac;
        return fa;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
