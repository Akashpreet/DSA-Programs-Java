public class FirstOccurence {
    static int search(int arr[],int x){
        int n=arr.length;
        int st=0;
        int end=arr.length-1;
        int fo=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(x==arr[mid]){
                fo=mid;
                end=mid-1;
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,6,6};
        int x=21;
        System.out.println(search(arr, x));
    }
}
