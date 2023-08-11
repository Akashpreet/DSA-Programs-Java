import java.util.Arrays;

public class SelectionSort {
    static void sort(int arr[],int n,int idx,int max){
        if(n==0){
            return;
        }
        if(idx<n){
            if(arr[idx]>arr[max]){
                sort(arr, n, idx+1, idx);
            }
            else{
                sort(arr, n, idx+1, max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[n-1];
            arr[n-1]=temp;
            sort(arr, n-1, 0, 0);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,5,1,3};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
        // System.out.println(sort(arr, arr.length, 0, 0));
    }
}
