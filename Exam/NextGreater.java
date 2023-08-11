import java.util.Scanner;

public class NextGreater {
    public static void ans(int arr[],int n){
        for(int i=0;i<n;i++){
            int nxt=-1;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    nxt=arr[j];
                }
                break;
            }
            System.out.println(arr[i]+"->"+nxt);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ans(arr, n);
    }
}
