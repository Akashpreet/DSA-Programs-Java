import java.util.Scanner;

public class Equal_reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int d1,d2,d3,d4,d5;
        int b=a;
        d1=a%10;
        a=a/10;
        d2=a%10;
        a=a/10;
        d3=a%10;
        a=a/10;
        d4=a%10;
        a=a/10;
        d5=a%10;
        int rev=d1*10000+d2*1000+d3*100+d4*10+d5;
        System.out.println(rev);
        if(b==rev){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
