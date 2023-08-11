import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<n;i++){
            // System.out.println(arr[i]);
            if(arr[i]<0){
                count1++;
            }
            if(arr[i]>0){
                count2++;
            }
            if(arr[i]==0){
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
