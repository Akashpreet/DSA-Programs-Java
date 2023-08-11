import java.util.Scanner;

public class Ques4 {
    public static void Power(int a,int b) {
        int p=1;
        for(int i=1;i<=b;i++){
            p=p*a;
        }
        System.out.println(p);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Power(a, b);

    }
}
