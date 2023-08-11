import java.util.Scanner;

public class Substring {
    public static void subsequencing(String str,int idx,String newStr) {
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char ch=str.charAt(idx);
        subsequencing(str, idx+1, newStr+ch);

        subsequencing(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        subsequencing(str, 0, "");
    }
}
