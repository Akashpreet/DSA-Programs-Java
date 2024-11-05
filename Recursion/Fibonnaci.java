import java.util.Scanner;

public class Fibonnaci {
    public static int printFib(int n){
        if(n<=1){
            return n;
        }
        return printFib(n-1)+printFib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=0;
        // int b=1;
        int n=sc.nextInt();
        // System.out.println(a);
        // System.out.println(b);
        // printFib(a, b, n-2);
        System.out.println(printFib(n));
    }
}
