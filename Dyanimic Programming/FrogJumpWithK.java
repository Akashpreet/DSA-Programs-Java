import java.util.Arrays;

public class FrogJumpWithK {
    public static int frog(int n,int arr[],int dp[],int k){
        dp[0]=0;
        for(int i=1;i<n;i++){
            int minStep=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int jump=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                    minStep=Math.min(minStep, jump);
                }
            }
            dp[i]=minStep;
        }
        return dp[n-1];
    }
    public static int solve(int n,int arr[],int k){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return frog(n, arr, dp, k);
    }
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50};
        int n=arr.length;
        int k=2;
        System.out.println(solve(n,arr,k));
    }
}
