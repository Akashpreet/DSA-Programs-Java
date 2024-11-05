public class DistributeChocolates {
    static boolean isPossible(int arr[],int m,int max){
        int students=1;
        int chocolates=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                return false;
            }
            if(chocolates+arr[i]<=max){
                chocolates+=arr[i];
            }
            else{
                students++;
                chocolates=arr[i];
            }
        }
        if(students>m){
            return false;
        }
        return true;
    }
    static int chocolates(int arr[],int m){
        if(arr.length<m){
            return -1;
        }
        int ans=0;
        int start=1;
        int end=(int)1e9;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(arr,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={12,34,67,60};
        int m=2;
        System.out.println(chocolates(arr, m));
    }
}
