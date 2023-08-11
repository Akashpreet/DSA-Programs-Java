import java.util.*;
public class MinimumSizeSubarraySum {
    static int subarray(int target,int arr[]){
        int l=0;
        int r=0;
        int s=0;
        int count=Integer.MAX_VALUE;
        for(r=0;r<arr.length;r++){
            s+=arr[r];
            while(s>=target){
            count=Math.min(count,r-l+1);
            l++;
            }
        }
        if(count==Integer.MAX_VALUE){
            return 0;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(subarray(target,arr));
    }
}
