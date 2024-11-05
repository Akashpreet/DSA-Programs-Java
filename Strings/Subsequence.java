package Strings;
import java.util.*;
class Subsequence {
    public static void sub(String str,int n,int idx,String curr){
        if(idx==n){
            return;
        }
        if(curr!=null && !curr.trim().isEmpty()){
            System.out.println(curr);
        }
        for(int i=idx+1;i<n;i++){
            curr+=str.charAt(i);
            sub(str, n, i, curr);
            curr=curr.substring(0, curr.length()-1);
        }
    }
    public static void print(String str){
        int idx=-1;
        String curr="";
        sub(str, str.length(), idx, curr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        print(str);
    }
}
