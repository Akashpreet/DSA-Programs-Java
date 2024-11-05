public class NegativePositive {
    static void partition(int arr[]){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            while(arr[l]<0){
                l++;
            }
            while(arr[r]>=0){
                r--;
            }
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={19,-20,7,-4,-13,77,-5,3};
        partition(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
