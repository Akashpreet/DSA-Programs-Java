public class Race_Track {
    static boolean isPossible(int arr[],int k,int dist){
        int kidPlaced=1;
        int lastKid=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastKid>=dist){
                kidPlaced++;
                lastKid=arr[i];
            }
        }
        return kidPlaced>=k;
    }
    static int raceTrack(int arr[],int k){
        if(k>arr.length){
            return -1;
        }
        int start=0;
        int end=(int)1e9;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,8,9};
        int k=2;
        System.out.println(raceTrack(arr, k));
    }   
}
