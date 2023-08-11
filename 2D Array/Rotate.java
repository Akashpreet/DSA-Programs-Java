import java.util.Scanner;

public class Rotate {
    static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println();
    }
    static void transpose(int arr[][],int n,int m){
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rot(int arr[][],int n){
        transpose(arr, n, n);
        for(int i=0;i<n;i++){
            reverse(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] numbers=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        // print(numbers);
        rot(numbers, n);
        print(numbers);
    }
}
