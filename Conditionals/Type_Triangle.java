import java.util.Scanner;

public class Type_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b==c){
            System.out.println("Right Triangle");
        }
        else if(a==b && b==c){
                System.out.println("Equilateral Triangle");
        }
        else if(a!=b && a!=c){
            System.out.println("Scalene Triangle");
        }
        else if(a==b && a!=b){
            System.out.println("Isosceles Triangle");
        }
    }
}
