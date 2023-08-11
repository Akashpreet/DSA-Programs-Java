import java.util.Scanner;

public class Valid_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of triangles");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int s=a1+a2+a3;
        if(s==180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not Valid Triangle");
        }
    }
}
