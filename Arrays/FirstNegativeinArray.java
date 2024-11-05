import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegativeinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        firstNegative(arr,k);
    }
    public static void firstNegative(int arr[],int k){
        Queue<Integer> qu=new LinkedList<>();
        int n=arr.length;
        int i=0;
        int j=0;
        while (j<n) {
            if(arr[j]<0){
                qu.offer(arr[j]);
            }
            if(j-i+1==k){
                if(qu.isEmpty()){
                    System.out.println("0 ");
                }
                else{
                    System.out.println(qu.peek()+" ");
                    if(arr[i]==qu.peek()){
                        qu.poll();
                    }
                }
                i++;
            }
            j++;
        }
    }
}
