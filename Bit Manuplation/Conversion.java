import java.util.Scanner;

public class Conversion {
    public static void DecimalToBinary(int n){
        int num[]=new int[1000];
        int i=0;
        while(n>0){
            num[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(num[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        DecimalToBinary(n);
    }
}
