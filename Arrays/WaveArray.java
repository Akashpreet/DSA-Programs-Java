import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i=i+2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
