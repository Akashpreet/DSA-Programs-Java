// package Dyanimic Programming;
import java.util.*;
public class Fibonacci {
    // Memoization Method
    static int fib(int n,int dp[]){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fib(n-1,dp)+fib(n-2, dp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        // Tabulation
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        //Space Optimization
        int prev2=0;
        int prev1=1;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        System.out.println(prev1);
        // System.out.println(dp[n]);
        // System.out.println(fib(n,dp));
    }
}
