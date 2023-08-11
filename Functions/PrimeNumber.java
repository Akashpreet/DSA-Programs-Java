import java.nio.channels.NetworkChannel;
import java.util.Scanner;

public class PrimeNumber {
    public static void factors(int n) {
        int c=2;
        while(n>1){
            if(n%c==0){
                System.out.print(c+" ");
                n=n/c;
            }
            else{
                c++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factors(n);
    }
}
