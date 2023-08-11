import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=56;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            // if(arr[i]==-1){
                // break;
            // }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==-1){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
