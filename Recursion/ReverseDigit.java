import java.util.*;
public class ReverseDigit {
    // static int sum=0;
    static int fun(int n){
        // if(n==0){
        //     return;
        // }
        // int rem=n%10;
        // sum=sum*10+rem;
        // fun(n/10);
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        // fun(1324);
        System.out.println(fun(1234));
    }
}
