public class Count_sort {
    static int maxi(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void sort(int arr[]){
        int max=maxi(arr);
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }
    // static void display(int arr[]){
    //     for(int i:arr){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    static void countSort(int arr[]){
        int n=arr.length;
        int ans[]=new int[n]; 
        int max=maxi(arr);
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            ans[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,2,5};
        countSort(arr);
        // display(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
