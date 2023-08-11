import java.util.Scanner;

public class Multiply {
    static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void mul(int arr[][],int r1,int c1,int brr[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("Invalid");
            return;
        }
        int multi[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    // multi[i][j]+=(arr[i][k]*brr[k][j]);
                    multi[i][j]+=(arr[i][k]*brr[k][j]);
                }
                // multi[i][j]+=()
            }
        }
        System.out.println("Multiplication");
        print(multi);
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
        mul(arr, r1, c1, brr, r2, c2);
    }
}
