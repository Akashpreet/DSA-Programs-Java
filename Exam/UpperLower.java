import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                str2+=(char)(str.charAt(i)-32);
            }
            else{
                str2+=(char)(str.charAt(i)+32);
            }
        }
        System.out.println(str2);
    }
}
