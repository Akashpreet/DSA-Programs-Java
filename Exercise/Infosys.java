// package Exercise;
import java.util.*;
public class Infosys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long totalMin=0;
        for(int i=0;i<n;i++){
            totalMin+=(arr[i]+k-1)/k;
        }
        System.out.println(totalMin);
    }
}
