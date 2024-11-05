import java.util.Scanner;

public class IsSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean res=isSubstringOfYes(str);
        System.out.println(res?"yes":"no");
    }
    public static boolean isSubstringOfYes(String str){
        int n=str.length();
        int repetionLen=3;
        if(n%repetionLen!=0){
            return false;
        }
        int repetion=n/repetionLen;
        for(int i=0;i<repetionLen;i++){
            String sub=str.substring(i, i+repetion);
            if(!sub.equals("Yes".substring(0,repetion))){
                return false;
            }
        }
        return true;
    }
}
