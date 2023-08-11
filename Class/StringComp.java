import java.util.Arrays;
import java.util.Scanner;

public class StringComp {
    public static void print(String str1,String str2) {
        String ans="";
        // if(str1.compareTo(str2)==0){
        //     System.out.println("Strings are equal");
        // }
        boolean used[]=new boolean[26];
        for(int i=0;i<str1.length();i++){
            boolean found = false;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found && !used[str1.charAt(i)-'a']){
                used[str1.charAt(i)-'a']=true;
                ans+=str1.charAt(i);
            }
        }

        for(int i=0;i<str2.length();i++){
            boolean found=false;
            for(int j=0;j<str1.length();j++){
                if(str2.charAt(i)==str1.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found && !used[str2.charAt(i)-'a']){
                used[str2.charAt(i)-'a']=true;
                ans+=str2.charAt(i);
            }
        }

        char tempArr[]=ans.toCharArray();
        Arrays.sort(tempArr);
        ans=new String(tempArr);
        if(ans.length()==0){
            System.out.println("Equal strings");
        }
        else{
            System.out.println(ans+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        // Arrays.sort(str1);
        // char arr[]=str1.toCharArray();
        // char brr[]=str2.toCharArray();

        // Arrays.sort(arr);
        // Arrays.sort(brr);\
        print(str1, str2);

    }
}
