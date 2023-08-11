import java.util.Arrays;

public class BubbleSort {
    static void sort(int arr[],int n,int idx){
        if(n==0){
            return;
        }
        if(idx<n){
            if(arr[idx]>arr[idx+1]){
                int temp=arr[idx];
                arr[idx]=arr[idx+1];
                arr[idx+1]=temp;
            }
            sort(arr, n, idx+1);
        }
        else{
            sort(arr, n-1, 0);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,1,2};
        sort(arr, arr.length-1, 0);
        // System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
