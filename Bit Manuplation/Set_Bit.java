import java.util.Scanner;

// package Bit Manuplation;

public class Set_Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int bitMask=1<<p;
        int newNumber=bitMask | n;
        System.out.println(newNumber);
    }
}
