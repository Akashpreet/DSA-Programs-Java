// package Sorting;

import java.util.*;

public class Bucket_sort {
    static void sort(float[] arr){
        int n=arr.length;
        ArrayList<Float>[] buckets=new ArrayList[n];
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }
        for(int i=0;i<n;i++){
            int bucketIdx=(int)arr[i]*n;
            buckets[bucketIdx].add(arr[i]);
        }
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        int idx=0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Float>currBucket=buckets[i];
            for(int j=0;j<currBucket.size();j++){
                arr[idx++]=currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float arr[]={0.2f,0.1f,0.32f,0.12f,0.56f,0.51f};
        sort(arr);
        for(float i:arr){
            System.out.print(i+" ");
        }
    }
}
