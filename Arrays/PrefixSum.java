import java.util.*;
public class PrefixSum {
    public static int[] sum(int arr[]) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        // return arr;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.print(sum(arr));
        int pref[]=sum(arr);
        for(int i=0;i<pref.length;i++){
            System.out.print(pref[i]+" ");
        }
        // for(int i=0;i<n;i++){
            // System.out.print(arr[i]+" ");
        // }
    }
}
