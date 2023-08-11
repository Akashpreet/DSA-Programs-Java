package Recursion;

import java.util.Scanner;

public class FirstAndLastOccurence {
    public static int first=-1;
    public static int last=-1;
    public static void occurence(String str,int idx,int element) {
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        occurence(str, idx+1, element);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        occurence(str, 0,'a');
    }
}
