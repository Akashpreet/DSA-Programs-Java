import java.util.Scanner;

// package Bit Manuplation;

public class Update_Bit {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=sc.nextInt();
    int oper=sc.nextInt();
    int bitMask=1<<p;
    if(oper==1){
        int newNumber=bitMask | n;
        System.out.println(newNumber);
    }
    else{
        int newBitMask=~(bitMask);
        int newNumber=newBitMask & n;
        System.out.println(newNumber);
    }
   }

}
