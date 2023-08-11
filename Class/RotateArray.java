import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int[] temp=new int[n];
        int x=0;
        for(int i=d;i<n;i++){
            temp[x]=arr[i];
            x++;
        }
        for(int i=0;i<d;i++){
            temp[x]=arr[i];
            x++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
