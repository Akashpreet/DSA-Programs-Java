public class AllIndicies {
    static void indicies(int arr[],int n,int tar,int idx){
        if(idx>=n){
            return;
        }
        if(arr[idx]==tar){
            System.out.println(idx);
        }
        indicies(arr, n, tar, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,4,6,8,1,2,1};
        indicies(arr,arr.length, 1, 0);
    }
}
