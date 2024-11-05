import java.util.Scanner;
public class MountainArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        // System.out.println(func(arr));
        for(int i=1;i<n-1;i+=2){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                flag=true;
                continue;
            }
            else{
                break;
            }
        }
        System.out.println(flag);
    }
}
