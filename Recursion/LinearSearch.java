import java.util.*;
public class LinearSearch {
    static int search(int arr[],int n,int tar,int idx){
        if(idx>=n){
            return -1;
        }
        if(arr[idx]==tar){
            return idx;
        }
        return search(arr, n, tar, idx+1);
    }
    static ArrayList<Integer>list=new ArrayList<>();
    static void searchAll(int arr[],int tar,int idx){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx]==tar){
            list.add(idx);
        }
        searchAll(arr, tar, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={8,4,6,4,3};
        int tar=4;
        // System.out.println(search(arr, arr.length, tar, 0));
        searchAll(arr, tar, 0);
        System.out.println(list);
    }
}
