import java.util.Scanner;

public class ReverseString {
    public static void Rstring(String str,int n){
        if(n==0){
            System.out.print(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        Rstring(str, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Rstring(str,str.length()-1);
    }
}
