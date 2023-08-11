import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int max=arr[n-1];
        int min=arr[0];
        System.out.println(max);
        System.out.println(min);
        int sub=arr[0];
        for(int i=1;i<n;i++){
            sub-=arr[i];
        }

        System.out.println(sub);
        if(sub>=0){
            System.out.println("Subtract is greater than zero");
        }
        else{
            System.out.println("Subtract is less than zero");
        }
    }
}
