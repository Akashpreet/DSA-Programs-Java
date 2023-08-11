import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            if(a>=x && a<y){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            t--;
        }
    }
}
