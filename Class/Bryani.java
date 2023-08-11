import java.util.Scanner;

public class Bryani {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r=x*y;
            System.out.println(r);
            t--;
        }
    }
}
