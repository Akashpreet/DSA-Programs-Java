import java.util.*;
public class AggresiveCows {
    static boolean isPossible(int n,int arr[],int dis){
        int count=1;
        int prevCow=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-prevCow>=dis){
                prevCow=arr[i];
                count++;
            }
        }
        if(count>=n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
