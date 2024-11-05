import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=findSubString(str);
        System.out.println(res);
    }
    public static String findSubString(String str){
        int n=str.length();
        for(int i=n-1;i>=1;i--){
            String prefix=str.substring(0, i);
            String suffix=str.substring(n-i,n);
            if(prefix.equals(suffix)){
                return prefix;
            }
        }
        for(int i=1;i<=n-2;i++){
            String prefix=str.substring(0, i);
            String suffix=str.substring(n-i, n);
            if(prefix.equals(suffix)){
                return suffix;
            }
        }
        for(int i=1;i<=n-2;i++){
            String substring=str.substring(1, n-1);
            if(substring.contains(str.substring(0, i)) && substring.contains(str.substring(n-i,n))){
                return str.substring(i, n-i);
            }
        }
        return "Not So Cool";
    }
}
