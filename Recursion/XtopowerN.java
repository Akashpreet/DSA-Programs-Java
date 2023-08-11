// package Recursion;

import java.util.Scanner;

public class XtopowerN {
    public static int xton(double x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        double xPown=xton(x, n-1);
        double xPown1=x*xPown;
        return (int) xPown1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(xton(x, n));
    }
}
