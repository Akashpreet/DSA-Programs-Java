import java.util.Scanner;

public class Factorial {
    public static int PrintFactorial(int n){
        int fact=1;
        if(n<0){
            return -1;
        }
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        // System.out.println(fact);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(PrintFactorial(n));   
    }
}
