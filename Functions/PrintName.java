// package Functions;

import java.util.Scanner;

public class PrintName {
    public static void NamePrint(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        NamePrint(n);
    }
}
