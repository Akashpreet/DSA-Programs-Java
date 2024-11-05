import java.util.*;
public class MaxSubArraySum {
    public static int sum(int arr[],int k){
        if(arr.length==0 || k<=0 || k>arr.length){
            return 0;
        }
        int n=arr.length;
        int subSum=0;
        for(int i=0;i<k;i++){
            subSum+=arr[i];
        }
        int maxSum=subSum;
        for(int i=k;i<n;i++){
            subSum=subSum-arr[i-k]+arr[i];
            maxSum=Math.max(maxSum, subSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        MaxSubArraySum sol=new MaxSubArraySum();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int maxSum=sol.sum(arr, k);
        System.out.println(maxSum);
    }
}
