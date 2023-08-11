import java.util.Scanner;

public class First_last_occr {
    static void ques(int arr[],int x){
        int n=arr.length;
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=x){
                continue;
            }
            if(first==-1){
                first=i;
            }
            last=i;
        }
        if(first!=-1){
            System.out.println(first);
            System.out.println(last);
        }
        else{
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        ques(arr, x);
    }
}
