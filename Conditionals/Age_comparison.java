import java.util.Scanner;

public class Age_comparison {
    public static void main(String[] args) {
        System.out.println("Enter the ages of Ram, Shyam and Ajay");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int s=sc.nextInt();
        int a=sc.nextInt();
        if(r<s){
            if(r<a){
                System.out.println("Ram is youngest");
            }
        }
        if(s<r){
            if(s<a){
                System.out.println("Shyam is youngest");
            }
        }
        else{
            System.out.println("Ajay is youngest");
        }
    }
}
