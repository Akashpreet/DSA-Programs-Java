import java.util.Scanner;

public class Conversion2 {
    public static int BinaryToDecimal(int n){
        int num=n;
        int dec_Val=0;
        int base=1;
        int temp=num;
        while(temp>0){
            int last_digit=temp%10;
            temp=temp/10;
            dec_Val=last_digit*base;
            base=base*2;
        }
        return dec_Val;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(n);
        // BinaryToDecimal(n);
        System.out.print(BinaryToDecimal(n));
    }
}
