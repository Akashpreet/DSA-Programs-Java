import java.util.ArrayList;

public class ArraySubsequence {
    public static void sub(int idx, ArrayList<Integer> ar,int arr[],int n){
        if(idx==n){
            for(int i:ar){
                System.out.print(i+" ");
            }
            if(ar.isEmpty()){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }
        ar.add(arr[idx]);
        sub(idx+1,ar,arr,n);
        // ar.remove(arr[idx])
        ar.remove(ar.size()-1);
        sub(idx+1,ar,arr,n);

    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        int n=3;
        ArrayList<Integer>ar =new ArrayList<>();
        sub(0,ar,arr,n);
    }
}
