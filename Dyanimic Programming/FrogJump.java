import java.util.Arrays;

public class FrogJump {
    //Memoization
    public static int fun(int idx,int height[],int dp[]){
        if(idx==0){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int left=fun(idx-1, height, dp)+Math.abs(height[idx]-height[idx-1]);
        int right=Integer.MAX_VALUE;
        if(idx>1){
        right=fun(idx-2, height, dp)+Math.abs(height[idx]-height[idx-2]);
        }
        return dp[idx]=Math.min(left, right);
    }
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50};
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        //Tabulation
        dp[0]=0;
        for(int i=1;i<n;i++){
            int left=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            int right=Integer.MAX_VALUE;
            if(i>1){
                right=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            }
            dp[i]=Math.min(right, left);
        }
        System.out.println(fun(n-1, arr, dp));
        System.out.println(dp[n-1]);
        //Space Optimization
        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){
            int left=prev+Math.abs(arr[i]-arr[i-1]);
            int right=Integer.MAX_VALUE;
            if(i>1){
                right=prev2+Math.abs(arr[i]-arr[i-2]);
            }
            int curr=Math.min(left, right);
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
}
