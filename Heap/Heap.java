/**
 * HeapSort
 */
class HeapSort {
    public void sort(int arr[],int n){
        for(int i=0;i<n;i++){
            heapify(arr,n,i);
        }
    }
    void heapify(int arr[],int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[r]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[l]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
        }
    }
}
public class Heap {
    public static void main(String[] args) {
        int arr[]={12,13,11,8,4};
        int n=arr.length;
        HeapSort ab=new HeapSort();
        ob.sort(arr,n);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
