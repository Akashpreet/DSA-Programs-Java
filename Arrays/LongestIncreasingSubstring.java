import java.util.Scanner;

public class LongestIncreasingSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=subsequence(arr);
        System.out.println(res);
    }
    public static int subsequence(int arr[]){
        if(arr==null || arr.length==0){
            return 0;
        }
        int n=arr.length;
        int dp[]=new int[n+1];
        dp[0]=1;
        int maxLength=1;
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
            maxLength=Math.max(dp[i],maxLength);
        }
        return maxLength;
    }
}
