import java.util.Scanner;

public class BinarySearch {
    static boolean binary(int arr[],int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return true;
            }
            else if(target<=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(binary(arr,target));
    }
}
