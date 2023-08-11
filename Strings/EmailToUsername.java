import java.util.Scanner;

public class EmailToUsername {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String uname="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@'){
                break;
            }
            else{
                uname+=str.charAt(i);
            }
        }
        System.out.println(uname);
    }
}
