import java.util.Scanner;

public class RotateArray {
    public static int[] ArrRotate(int arr[],int k) {
        int n=arr.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans[]=ArrRotate(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
        }
    }
}
