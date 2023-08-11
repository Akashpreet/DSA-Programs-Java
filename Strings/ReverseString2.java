import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        char ch;
        String rstr="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rstr=ch+rstr;
        }
        System.out.println("Reversed String is");
        System.out.println(rstr);
    }
}
