import java.util.Scanner;

public class Burgers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int p,b;
            p=sc.nextInt();
            b=sc.nextInt();
            if(p<b){
                System.out.println(p);
            }
            else{
                System.out.println(b);
            }
            t--;
        }
    }
}
