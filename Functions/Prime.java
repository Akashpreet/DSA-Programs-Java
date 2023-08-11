import java.util.Scanner;

public class Prime {
    public static void PrimeNumber(int n){
        boolean flag=false;
        for(int i=2;i<=n/2;++i){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrimeNumber(n);
    }
}
