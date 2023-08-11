// package Sorting;

public class Sort_linear {
    static void sort(int arr[]){
        int n=arr.length;
        if(n<=1){
            return;
        }
        int x=-1;
        int y=-1;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int arr[]={3,8,6,7,5,9,10};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
