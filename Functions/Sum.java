import java.util.Scanner;

public class Sum {
    public static int CalculateSum(int a,int b){
        int s=a+b;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=CalculateSum(a, b);
        System.out.println(sum);
    }
}
