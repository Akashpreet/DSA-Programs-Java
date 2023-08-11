public class Radix_sort {
    static int maxi(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void countSort(int arr[],int place){
        // int max=maxi(arr);
        int n=arr.length;
        int ans[]=new int[n];
        int count[]=new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            ans[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
    static void radixSort(int arr[]){
        int max=maxi(arr);
        for(int place=1;max/place>0;place*=10){
            countSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int arr[]={170,45,75,90,802,2};
        radixSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
