// package Recursion;

import java.util.Scanner;

public class RemoveDuplicate {
    public static boolean map[]=new boolean[26];
    public static void remove(String str,int idx,String nstr) {
        if(idx==str.length()){
            System.out.println(nstr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']){
            remove(str, idx+1, nstr);
        }
        else{
            nstr+=currChar;
            map[currChar-'a']=true;
            remove(str, idx+1, nstr);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        remove(s, 0, "");
    }
}
