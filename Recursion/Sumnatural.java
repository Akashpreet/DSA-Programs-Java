// package Recursion;

import java.util.Scanner;

public class Sumnatural {
    public static int Printsum(int n) {
        if(n==0){
            return 0;
        }
        return n+Printsum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int i=sc.nextInt();
        int n=sc.nextInt();
        // int sum=0;
        System.out.println(Printsum(n));
    }
}
