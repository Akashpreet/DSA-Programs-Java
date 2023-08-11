import java.util.Arrays;

public class MergeSort {
    static int[] sort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=sort(Arrays.copyOfRange(arr, 0, mid));
        int right[]=sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    static int[] merge(int left[],int right[]){
        int mix[]=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
    static void sort2(int arr[],int s,int e){
        if(e-s==1){
            return;
        }
        int mid=arr.length/2;
        sort2(arr,s, mid);
        sort2(arr, mid, e);
        mergeinplace(arr,s,mid,e);
    }
    static void mergeinplace(int arr[],int s,int mid,int e){
        int mix[]=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        // return mix;
        for(int x=0;x<mix.length;x++){
            arr[s+x]=mix[x];
        }
    }
    public static void main(String[] args) {
        int arr[]={8,3,4,12,5,6};
        sort2(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }   
}
