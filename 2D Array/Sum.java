import java.util.Scanner;

public class Sum {
    static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int arr[][],int r1,int c1,int brr[][],int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Invalid Matrix");
            return;
        }
        int sum[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=arr[i][j]+brr[i][j];
            }
        }
        print(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int brr[][]=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        // print(arr);
        // print(brr);
        System.out.println("Sum is ");
        add(arr, r1, c1, brr, r2, c2);
    }
}
