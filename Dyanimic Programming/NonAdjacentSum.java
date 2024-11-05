import java.util.Arrays;

public class NonAdjacentSum {
    //Memoization
    public static int fun(int idx,int arr[],int dp[]){
        if(idx<0){
            return 0;
        }
        if(idx==0){
            return arr[idx];
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int pick=arr[idx]+fun(idx-2, arr, dp);
        int notPick=0+fun(idx-1, arr, dp);
        return dp[idx]=Math.max(pick, notPick);
    }
    public static int solve(int n,int arr[]){
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return fun(n-1, arr, dp);
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,9};
        int n=arr.length;
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        int res=solve(n, arr);
        System.out.println(res);
    }
}
