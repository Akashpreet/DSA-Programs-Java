public class BinarySearch {
    static boolean search(int arr[],int st,int end,int target){
        if(st>end){
            return false;
        }
        int mid=(st+end)/2;
        if(target==arr[mid]){
            return true;
        }
        else if(target<arr[mid]){
            return search(arr, st, mid-1, target);
        }
        else{
            return search(arr, mid+1, end, target);
        }
        // return false;
    }
    public static void main(String[] args) {
        int arr[]={1,20,21,87,90,99,102};
        System.out.println(search(arr, 0, arr.length-1, 102));
    }
}
