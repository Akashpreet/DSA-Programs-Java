public class SubarrayWithGreaterthanK {
    public static int subarray(int arr[],int size,int k){
        int count=0;
        int windowSize=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k){
                windowSize++;
                if(windowSize==k){
                    count++;
                    windowSize--;
                }
            }
            else{
                windowSize=0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,2,7,2,4,3,7};
        int k=3;
        int size=3;
    }
}