import java.util.ArrayList;

public class ArraySubsequenceWithKSum {
    public static void printSum(int idx,ArrayList<Integer> list,int s,int sum,int arr[],int n){
        if(idx==n){
            if(s==sum){
                for(int i:list){
                    System.out.println(i+" ");
                }
                System.out.println();
            }
            return;
        }
        list.add(arr[idx]);
        s+=arr[idx];
        printSum(idx+1, list, s, sum, arr, n);
        s-=arr[idx];
        list.remove(list.size()-1);
        printSum(idx+1, list, s, sum, arr, n);
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=3;
        int sum=2;
        ArrayList<Integer> list=new ArrayList<>();
        printSum(0,list,0,sum,arr,n);
    }
}
