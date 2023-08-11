import java.util.Arrays;
import java.util.Scanner;

public class Roses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int arr[]=new int[n];
        // while(t!=0){
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int f1=0;
        int f2=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum>t){
                right--;
            }
            else if(sum<t){
                left++;
            }
            else{
                f1=left;
                f2=right;

                left++;
                right--;
            }
        }
        System.out.println(f1+" "+f2);
    // }
    }
}
