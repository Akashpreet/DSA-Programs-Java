// package Exercise;

import java.util.Scanner;

public class Ques1 {
    public static int Average(int a,int b,int c) {
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Average(a,b,c));
    }
}
