
public class ArrayRecursive {
    static void array(int arr[],int x){
        if(x==arr.length){
            return;
        }
        System.out.println(arr[x]);
        array(arr, x+1);
    }
    public static void main(String[] args) {
        int arr[]={5,8,7,6,4};
        array(arr, 0);
    }
}
