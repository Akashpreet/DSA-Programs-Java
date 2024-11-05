import java.util.Scanner;

public class MaxOddLength {
    public static int length(int arr[]){
        if(arr.length==0){
            return 0;
        }
        int currLength=0;
        int maxLength=0;
        for(int i:arr){
            if(i%2!=0){
                currLength++;
                maxLength=Math.max(maxLength, currLength);
            }
            else{
                currLength=0;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        MaxOddLength sol=new MaxOddLength();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=sol.length(arr);
        System.out.println(ans);
    }
}
