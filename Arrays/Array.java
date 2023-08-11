import java.util.*;
// package Arrays;

public class Array {
    public static void main(String[] args) {
        // int marks[]=new int[3];
        // marks[0]=89;
        // marks[1]=80;
        // marks[2]=87;
        // int marks[]={89,88,90};
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
