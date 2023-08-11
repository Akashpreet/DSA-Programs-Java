import java.util.Scanner;

public class NextPermutation {
    public static void perm(int arr[]){
        int n=arr.length,i,j;
        for(i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                break;
            }
        }
        if(i<0){
            reverse(arr,0,arr.length-1);
        }
        else{
            for(j=n-1;j>i;j--){
                if(arr[j]>arr[i]){
                    break;
                }
                // swap(arr,i,j);
            }
            swap(arr,i,j);
            reverse(arr,i+1,arr.length-1);
        }
    }
    public static void reverse(int arr[],int i,int j) {
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int arr[],int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        perm(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
