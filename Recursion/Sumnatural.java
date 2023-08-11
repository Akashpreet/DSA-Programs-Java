package Recursion;

import java.util.Scanner;

public class Sumnatural {
    public static void Printsum(int i,int n,int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        Printsum(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int n=sc.nextInt();
        // int sum=0;
        Printsum(i, n, 0);
    }
}
